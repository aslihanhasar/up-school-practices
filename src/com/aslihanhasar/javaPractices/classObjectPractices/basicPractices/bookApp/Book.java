package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.bookApp;

public class Book {
    String title;
    String type;
    boolean isHardCover;
    int pageNumber;
    int currentPage;
    Author author;
    Reader reader;

    public Book(String title,String type,boolean isHardCover,int pageNumber,Author author){
        this.title=title;
        this.type=type;
        this.isHardCover=isHardCover;
        this.pageNumber=pageNumber;
        this.author=author;
        author.setBook(this);
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
