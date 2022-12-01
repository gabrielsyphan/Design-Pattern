package com.syphan.controller;

import com.syphan.model.Book;

import java.util.List;

public interface Library {

    public Book getBook(String title);

    public List<Book> getAllByAuthor(String author);
}
