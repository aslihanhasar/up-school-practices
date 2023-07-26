package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.bookApp;

public class Main {
    public static void main(String[] args) {
        Author author=new Author("Jean Paul Sartre");
        Book book=new Book("Bulantı","felsefe",true,222,author);
        Reader reader=new Reader("Aslıhan",25,'K',book);

        System.out.println(reader.getBook().title);
        System.out.println(reader.getBook().pageNumber);
        System.out.println(reader.getBook().isHardCover);
        System.out.println(reader.getBook().author.name);
        System.out.println(author.getBook().title);
        System.out.println(book.getReader().name);
        System.out.println(book.getAuthor().name);
    }
}
