package com.example.demo.infrastructure.Repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.demo.Domain.Contracts.IGetBooksRepository;
import com.example.demo.Domain.Entities.Book;

public class GetBooksRepository implements IGetBooksRepository {

//private List<Book> _books;

    public GetBooksRepository() {
        
        
    }

    @Override
    public List<Book> getAllBooks() {
        
        Book book=new Book();
        book.setId(UUID.randomUUID());
        book.setTitle("Una vida, muchas vidas");

        Book book1=new Book();
        book1.setId(UUID.randomUUID());
        book1.setTitle("Steve Jobs: La biografia");

        Book book2=new Book();
        book2.setId(UUID.randomUUID());
        book2.setTitle("Elon Musk");

        List<Book> _books = new ArrayList<Book>();
        _books.add(book);
        _books.add(book1);
        _books.add(book2); 

        return _books;
    }

    @Override
    public Book getBookById() {
        return null;//_books.get(0);
    }
    
}
