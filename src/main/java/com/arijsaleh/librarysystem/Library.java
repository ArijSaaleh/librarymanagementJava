/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arijsaleh.librarysystem;

import java.util.ArrayList;

/**
 *
 * @author arijs
 */
public class Library {

    private String name;
    private String address;
    private ArrayList<Book> books;

    public Library() {
    }

    public Library(String name, String address, ArrayList<Book> books) {
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public Book findBook(String title) {
        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Library{" + "name=" + name + ", address=" + address + ", books=" + books + '}';
    }
    
}
