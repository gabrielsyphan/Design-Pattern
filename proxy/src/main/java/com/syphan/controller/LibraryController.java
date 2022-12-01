package com.syphan.controller;

import com.syphan.model.Book;

import java.time.LocalDate;
import java.util.List;

public class LibraryController implements Library {


    @Override
    public Book getBook(String title) {
        this.connectToServer();
        return new Book(title, "Syphan", 347, LocalDate.now().minusYears(5));
    }

    @Override
    public List<Book> getAllByAuthor(String author) {
        this.connectToServer();
        return List.of(
                new Book("Java", author, 347, LocalDate.now().minusYears(5)),
                new Book("Pyhon", author, 216, LocalDate.now().minusYears(1)),
                new Book("TypeScript", author, 325, LocalDate.now().minusYears(2))
            );
    }

    private void connectToServer() {
        System.out.println("Connecting to server...");
        this.experiencyNetworkLatency();
        System.out.println("Connected to server!");
    }

    private void experiencyNetworkLatency() {
        int random = (int) (Math.random() * 1000);
        try {
            System.out.println("Experiencing network latency of " + random + "ms");
            Thread.sleep(random);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
