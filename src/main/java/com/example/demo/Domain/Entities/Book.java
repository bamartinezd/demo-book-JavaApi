package com.example.demo.Domain.Entities;

import java.util.*;

public class Book {
    private UUID Id;
    private Long ISBN;
    private String Title;
    private Cathegory Cathegory;
    private Author Author;
    private Date PublicationDate;
    
    public UUID getId() {
        return Id;
    }
    public void setId(UUID id) {
        Id = id;
    }
    public Long getISBN() {
        return ISBN;
    }
    public void setISBN(Long iSBN) {
        ISBN = iSBN;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public Cathegory getCathegory() {
        return Cathegory;
    }
    public void setCathegory(Cathegory cathegory) {
        Cathegory = cathegory;
    }
    public Author getAuthor() {
        return Author;
    }
    public void setAuthor(Author author) {
        Author = author;
    }
    public Date getPublicationDate() {
        return PublicationDate;
    }
    public void setPublicationDate(Date publicationDate) {
        PublicationDate = publicationDate;
    }
}
