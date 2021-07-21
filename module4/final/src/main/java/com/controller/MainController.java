package com.controller;

import com.model.dto.QuestionDto;
import com.model.entity.Question;
import com.model.entity.QuestionType;
import com.model.service.IQuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;
import javax.management.Query;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = {"","question"})
public class MainController {
    @Autowired
    IQuestionService questionService;

    @ModelAttribute("questionTypes")
    public List<QuestionType> questionTypeList(){
        return this.questionService.listQuestionType();
    }
    @GetMapping({"","/search"})
    public ModelAndView showList(@RequestParam("name") Optional<String> name,
                                 @RequestParam("questionType") Optional<String> questionType,
                                  @PageableDefault(value = 2) Pageable pageable){
        Page<Question> questionPage=this.questionService.findAll(name.orElse(""),questionType.orElse(""),pageable);
        return new ModelAndView("list","questions",questionPage)
                .addObject("name",name.orElse(""))
                .addObject("questionType",questionType.orElse(""));
    }

    @GetMapping(value = "create")
    public String showFormCreate(Model model){
        model.addAttribute("questionDto",new QuestionDto());
        return "create";
    }
    @PostMapping(value = "create")
    public String createQuesstion(@ModelAttribute @Valid QuestionDto questionDto,
                                  BindingResult bindingResult ,
                                  RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            return "create";
        }
        Question question = new Question();
        BeanUtils.copyProperties(questionDto,question);
        this.questionService.save(question);
        redirectAttributes.addFlashAttribute("msg","Create new Question successfully!!!");
        return "redirect:/question";
    }
    @GetMapping(value = "edit")
    public String showFormEdit(@RequestParam Long id,Model model){
        Question question = this.questionService.findById(id);
        QuestionDto questionDto = new QuestionDto();
        BeanUtils.copyProperties(question,questionDto);
        model.addAttribute("questionDto",questionDto);
        return "edit";
    }
    @PostMapping(value = "edit")
    public String editQuesstion(@ModelAttribute @Valid QuestionDto questionDto,
                                  BindingResult bindingResult ,
                                  RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            return "edit";
        }
        questionDto.setStatus("Đã Phản Hồi");
        Question question = new Question();
        BeanUtils.copyProperties(questionDto,question);
        this.questionService.save(question);
        redirectAttributes.addFlashAttribute("msg","Edit Question successfully!!!");
        return "redirect:/question";
    }
    @PostMapping(value = "delete")
    public String deleteQuestion(@RequestParam Long id,RedirectAttributes redirectAttributes){
        this.questionService.remove(id);
        redirectAttributes.addFlashAttribute("msg","Delete Question successfully!!!");
        return "redirect:/question";
    }
}
