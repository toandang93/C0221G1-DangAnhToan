package com.model.dto;

import com.model.entity.QuestionType;
import lombok.Getter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class QuestionDto implements Validator {
    private Long id;
    @NotBlank(message = "please input title")
    @Size(min=5,max =100,message = "từ 5-100 ký tự")
    private String title;
    @NotBlank(message = "please input question")
    private String question;
    @Size(min=10,max =500,message = "từ 10-500 ký tự")
    private String answer;
    private String dateCreate = LocalDate.now().toString();
    private String status="Chờ phản hồi";
    private QuestionType questionType;

    public QuestionDto() {
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
