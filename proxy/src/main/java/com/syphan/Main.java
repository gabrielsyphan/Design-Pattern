package com.syphan;

import com.syphan.controller.Library;
import com.syphan.controller.LibraryCacheProxy;
import com.syphan.controller.LibraryController;

public class Main {

    private static final Library library = new LibraryCacheProxy(new LibraryController());

    public static void main(String[] args) {
        // Before cache
        System.out.println(" --- Before cache --- ");
        System.out.println(library.getBook("Clean Code").toString());
        library.getAllByAuthor("Gabriel Syphan").forEach(bfc -> System.out.println(bfc.toString()));

        // After cache
        System.out.println(" --- After cache --- ");
        System.out.println(library.getBook("Clean Code").toString());
        library.getAllByAuthor("Gabriel Syphan").forEach(afc -> System.out.println(afc.toString()));

        // Other books (don't exist in cache)
        System.out.println(" --- Other books --- ");
        System.out.println(library.getBook("Design pattern").toString());
        library.getAllByAuthor("Syphan Gabriel").forEach(obfc -> System.out.println(obfc.toString()));
    }
}