package com.example.blog.model.repository;

import com.example.blog.model.entity.Blog;
import com.example.blog.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog , Integer> {
        Page<Blog> findAllByNameContaining(String name, Pageable pageable);
        Page<Blog> findAll(Pageable pageable);
    
}
