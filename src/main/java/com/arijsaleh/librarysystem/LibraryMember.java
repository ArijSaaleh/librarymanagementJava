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
public class LibraryMember {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public LibraryMember() {
    }

    public LibraryMember(String name, String memberId, ArrayList<Book> borrowedBooks) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    public void borrowBook(Book book){
        book.setAvailable(false);
        this.borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        book.setAvailable(true);
        this.borrowedBooks.remove(book);
    }
}
