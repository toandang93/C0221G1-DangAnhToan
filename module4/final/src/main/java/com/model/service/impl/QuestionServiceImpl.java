package com.model.service.impl;

import com.model.entity.Question;
import com.model.entity.QuestionType;
import com.model.repository.IQuestionRepository;
import com.model.repository.IQuestionTypeRepository;
import com.model.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements IQuestionService {
    @Autowired
    IQuestionRepository questionRepository;
    @Autowired
    IQuestionTypeRepository questionTypeRepository;


    @Override
    public Page<Question> findAll(String name, String questionType, Pageable pageable) {
        return this.questionRepository.findAllQuestion(name, questionType, pageable);
    }

    @Override
    public Question findById(Long id) {
        return this.questionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Question question) {
        this.questionRepository.save(question);
    }

    @Override
    public void remove(Long id) {
        this.questionRepository.deleteById(id);
    }

    @Override
    public List<QuestionType> listQuestionType() {
        return this.questionTypeRepository.findAll();
    }
}
