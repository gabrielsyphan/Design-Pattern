package com.syphan.model;

import java.time.LocalDate;

public class BookDataCache {

    private LocalDate lastUpdate;
    private Book book;


    public BookDataCache(Book book) {
        this.book = book;
        this.lastUpdate = LocalDate.now();
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public Book setBook(Book book) {
        this.book = book;
        this.lastUpdate = LocalDate.now();
        return this.book;
    }
}
