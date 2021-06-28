package com.example.book_management.model.service.impl;

import com.example.book_management.model.entity.Book;
import com.example.book_management.model.repository.IBookRepository;
import com.example.book_management.model.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    IBookRepository bookRepository;
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public void save(Book book) {
        this.bookRepository.save(book);
    }

    @Override
    public void remove(Long id) {
        this.bookRepository.deleteById(id);
    }
}
