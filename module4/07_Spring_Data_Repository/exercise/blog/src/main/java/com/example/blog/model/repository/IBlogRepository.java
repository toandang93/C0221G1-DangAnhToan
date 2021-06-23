package com.example.blog.model.repository;

import com.example.blog.model.entity.Blog;
import com.example.blog.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog , Integer> {
//    Iterable<Blog> findAllByCategory(Category category);
    
}
