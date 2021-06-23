package com.example.blog.model.service;

import com.example.blog.model.entity.Blog;
import com.example.blog.model.entity.Category;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    Iterable<Blog> findAll();

    Optional<Blog> findById(Integer id);

    void save(Blog blog);

    void remove(Integer id);
//    Iterable<Blog> findAllByCategory(Category category);
}
