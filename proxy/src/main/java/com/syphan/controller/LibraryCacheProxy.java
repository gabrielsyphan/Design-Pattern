package com.syphan.controller;

import com.syphan.model.Book;
import com.syphan.model.BookDataCache;
import com.syphan.model.BookListDataCache;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;

public class LibraryCacheProxy implements Library {

    private final Library library;
    private BookDataCache book;
    private BookListDataCache books;

    public LibraryCacheProxy(Library library) {
        this.library = library;
    }

    @Override
    public Book getBook(String title) {
        if(
            this.book == null ||
            !this.book.getBook().getTitle().equals(title) ||
            this.book.getLastUpdate().isBefore(LocalDate.now().minusDays(1))
        ){
            this.book = new BookDataCache(library.getBook(title));
        }
        return this.book.getBook();
    }

    @Override
    public List<Book> getAllByAuthor(String author) {
        if(
            this.books == null ||
            this.books.getBooks().isEmpty() ||
            !this.books.getBooks().get(0).getAuthor().equals(author) ||
            this.book.getLastUpdate().isBefore(LocalDate.now().minusDays(1))
        ) {
            this.books = new BookListDataCache(this.library.getAllByAuthor(author));
        }
        return this.books.getBooks();
    }
}
