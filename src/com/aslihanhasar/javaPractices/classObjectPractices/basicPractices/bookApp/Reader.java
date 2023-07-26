package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.bookApp;

public class Reader {
    String name;
    int age;
    char sex;
    Book book;

    public Reader(String name,int age,char sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public Reader(String name,int age,char sex,Book book){
        this(name,age,sex);
        this.book=book;
        book.setReader(this);
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

}
