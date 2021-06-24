package com.example.blog.model.service;

import com.example.blog.model.entity.Blog;
import com.example.blog.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IBlogService {
    Iterable<Blog> findAll();

    Optional<Blog> findById(Integer id);

    void save(Blog blog);

    void remove(Integer id);

    Page<Blog> findAllByNameContaining(String name, Pageable pageable);

    Page<Blog> findAll(Pageable pageable);;
//
}
