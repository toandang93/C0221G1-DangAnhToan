package com.model.service;

import com.model.entity.Comment;

import java.util.List;

public interface ICommentService {
    List<Comment> findAll();
    Comment findById(Long id);
    Comment save(Comment comment);
    void like(Long id);
}
