package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.bookApp;

public class Author {
    String name;
    Book book;

    public Author(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }


}
