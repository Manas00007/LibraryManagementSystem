package com.LibraryManagementSystem.service;

import com.LibraryManagementSystem.model.Book;
import com.LibraryManagementSystem.model.User;

public class Library {

    private Book[] books;
    private User[] users;

    private int bookCount=0;
    private int userCount=0;

    public void addBook(Book book)
    {
        books[bookCount+1] = book;

    }
    public void addUser(User user)
    {
        users[userCount+1] = user;
    }

    public void viewBooks()
    {
        for(int i=0;i<bookCount;i++){
            books[i].displayBook();
        }
    }

    public void viewUsers()
    {
        for(int i=0;i<userCount;i++){
            users[i].dispayUser();
        }
    }

    public void issueBook(Book book){

    }
}
