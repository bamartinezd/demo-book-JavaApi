package com.example.demo.Domain.Contracts;

import java.util.List;

import com.example.demo.Domain.Entities.Book;

import org.springframework.stereotype.Repository;

@Repository
public interface IGetBooksRepository {
    public List<Book> getAllBooks();
    public Book getBookById();
}
