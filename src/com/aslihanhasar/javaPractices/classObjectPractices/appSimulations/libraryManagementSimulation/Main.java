package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.libraryManagementSimulation;

public class Main {
    public static void main(String[] args) {
        Author author1=new Author("Friedrich Nietzsche");
        Book book1=new Book("İnsanca,Pek İnsanca",author1,300);
        Book book2=new Book("Böyle Buyurdu Zerdüşt",author1,656);
        User user=new User("Aslı","aslihan_hasar@hotmail.com",25);
        LibraryWorker libraryWorker1=new LibraryWorker("Aslı","Manager");
        LibrarySystem librarySystem=new LibrarySystem();
        librarySystem.addAuthor(author1);
        librarySystem.addBook(book1);
        librarySystem.addBook(book2);
        librarySystem.addWorker(libraryWorker1);
        librarySystem.addUser(user);
        librarySystem.listBooksInLibrary();
        librarySystem.removeBook(book1);
        librarySystem.listBooksInLibrary();
        librarySystem.listAuthorsInLibrary();
        librarySystem.listWorkersInLibrary();
        librarySystem.listUsersInLibrary();

    }
}
