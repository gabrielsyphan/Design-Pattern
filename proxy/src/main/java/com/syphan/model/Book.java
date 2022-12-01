package com.syphan.model;

import java.time.LocalDate;

public class Book {

    private String title;
    private String author;
    private int pages;
    private LocalDate published;

    public Book() { }

    public Book(String title, String author, int pages, LocalDate published) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.published = published;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public LocalDate getPublished() {
        return published;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }

}
