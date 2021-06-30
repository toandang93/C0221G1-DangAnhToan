package com.example.blog.controller;

import com.example.blog.model.entity.Blog;
import com.example.blog.model.entity.Category;
import com.example.blog.model.service.IBlogService;
import com.example.blog.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/blogs")
public class BlogRestController {

    @Autowired
    IBlogService blogService;
    @Autowired
    ICategoryService categoryService;

    @GetMapping
    public ResponseEntity<Iterable<Blog>> findAllBlog(){
        List<Blog> blogList = (List<Blog>) this.blogService.findAll();
        if (blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }

    @GetMapping(value = "/category")
    public ResponseEntity<Iterable<Category>> findAllCategory(){
        List<Category> categoryList = (List<Category>) this.categoryService.findAll();
        if (categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList,HttpStatus.OK);
    }

    @GetMapping(value = "/blog-of-category/{id}")
    public ResponseEntity<List<Blog>> findAllBlogByCategory(@PathVariable Long id){
        List<Blog> blogList = this.blogService.findAllBlogByCategory(id);
        if (blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }
    @GetMapping(value = "/detail/{id}")
    public ResponseEntity<Blog> findBlogById(@PathVariable Integer id){
        Blog blog = this.blogService.findById(id).orElse(null);
        if (blog == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }
}
