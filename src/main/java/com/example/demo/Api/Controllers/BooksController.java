package com.example.demo.Api.Controllers;

import java.util.List;

import com.example.demo.Domain.Contracts.IGetBooksRepository;
import com.example.demo.Domain.Entities.Book;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/books")
public class BooksController {
    
    private IGetBooksRepository _booksRepository;

    public BooksController(IGetBooksRepository booksRepository) {
        _booksRepository = booksRepository;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/books")
    public List<Book> getBooks(){
        return _booksRepository.getAllBooks();
    }

}
