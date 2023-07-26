package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.libraryManagementSimulation;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Book> books;
    private List<Author> authors;
    private List<User> users;
    private List <LibraryWorker> libraryWorkers;

    public LibrarySystem(){
        books=new ArrayList<>();
        authors=new ArrayList<>();
        users=new ArrayList<>();
        libraryWorkers=new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void addAuthor(Author author){
        authors.add(author);
    }
    public void removeAuthor(Author author){
        authors.remove(author);
    }

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public void addWorker(LibraryWorker libraryWorker){
        libraryWorkers.add(libraryWorker);
    }

    public void removeWorker(LibraryWorker libraryWorker){
        libraryWorkers.remove(libraryWorker);
    }

    public void listBooksInLibrary(){
        System.out.println("****** BOOKS ******");
        for(Book book:books){
            book.printBookInfo();
        }
    }

    public void listUsersInLibrary(){
        System.out.println("****** USERS ******");
        for(User user:users){
            user.printUserInfo();
        }
    }

    public void listAuthorsInLibrary(){
        System.out.println("****** AUTHORS ******");
        for(Author author:authors){
            author.printAuthorInfo();
        }
    }

    public void listWorkersInLibrary(){
        System.out.println("****** WORKERS ******");
        for(LibraryWorker worker:libraryWorkers){
            worker.printWorkerInfo();
        }
    }
}
