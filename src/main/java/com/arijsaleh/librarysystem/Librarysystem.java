/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.arijsaleh.librarysystem;

import java.util.ArrayList;

/**
 *
 * @author arijs
 */
public class Librarysystem {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book("Book1", "arij1", "ok", true);
        Book book2 = new Book("Book2", "arij1", "o2k", true);
        Book book3 = new Book("Book3","arij1","o1k",true);
        books.add(book1); books.add(book3);
        Library library = new Library();
        library.setName("Friends");
        library.setAddress("Norway");
        library.setBooks(books);
       // System.out.println(library.toString());
        System.out.println(library.findBook("Book11"));
    }
}
