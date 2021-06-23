package com.example.blog.model.service.impl;

import com.example.blog.model.entity.Blog;
import com.example.blog.model.entity.Category;
import com.example.blog.model.repository.IBlogRepository;
import com.example.blog.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements IBlogService {

    @Autowired
    IBlogRepository iBlogRepository;


    @Override
    public Iterable<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return iBlogRepository.findById(id);
    }


    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }


    @Override
    public void remove(Integer id) {
        iBlogRepository.deleteById(id);
    }

//    public Iterable<Blog> findAllByCategory(Category category){
//        return iBlogRepository.findAllByCategory(category);
//    }
}
