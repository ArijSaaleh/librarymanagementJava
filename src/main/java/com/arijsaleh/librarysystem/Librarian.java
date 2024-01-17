/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arijsaleh.librarysystem;

/**
 *
 * @author arijs
 */
public class Librarian {

    private String name;
    private String employeeId;

    public Librarian() {
    }

    public Librarian(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public Librarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void checkOutBook(Book book, LibraryMember member) {
        member.returnBook(book);
    }

    public void checkInBook(Book book, LibraryMember member) {
        member.borrowBook(book);
    }
}
