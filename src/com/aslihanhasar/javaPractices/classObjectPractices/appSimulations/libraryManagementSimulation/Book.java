package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.libraryManagementSimulation;

public class Book {
    private String name;
    private Author author;
    private int pageCount;

    public Book(String name,Author author,int pageCount){
        this.name=name;
        this.author=author;
        this.pageCount=pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void printBookInfo(){
        System.out.println("------- BOOKS INFO -------"+'\n'+
                "Book name : "+name+'\n'+
                "Author : "+author.getName()+'\n'+
                "Page :"+pageCount);
        System.out.println();
    }
}
