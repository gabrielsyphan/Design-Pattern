package com.syphan.model;

import java.time.LocalDate;
import java.util.List;

public class BookListDataCache {

    private final LocalDate lastUpdate;
    private final List<Book> books;


    public BookListDataCache(List<Book> books) {
        this.books = books;
        this.lastUpdate = LocalDate.now();
    }

    public List<Book> getBooks() {
        return books;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }
}
