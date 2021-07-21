package com.model.service;

import com.model.entity.Question;
import com.model.entity.QuestionType;

import java.util.List;

public interface IQuestionService extends IGenerateService<Question> {
    List<QuestionType> listQuestionType();
}
