package com.LibraryManagementSystem.service;

import com.LibraryManagementSystem.model.Book;
import com.LibraryManagementSystem.model.User;

public class Library {

    private Book[] books=new Book[150];
    private User[] users=new  User[100];

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

    public void issueBook(int userID, int bookID){
        Book book=null;
        User user=null;
        for(int i=0;i<bookCount;i++){
            if(books[i].getBookId()==bookID){
                book=books[i];
                break;
            }
        }

        for(int i=0;i<userCount;i++){
            if(users[i].getUserId()==userID){
                user=users[i];
                break;
            }
        }

        if(book!=null && user!=null && book.getBookAvailable())
        {
            book.markedIssue();
            user.issueBook();
            System.out.println("Book Issued successfully");
        }
        else {
            System.out.println("Issue failed!");
        }


    }



    public void returnBook(int userID, int bookID){
        Book book=null;
        User user=null;

        for(int i=0;i<bookCount;i++){
            if(books[i].getBookId()==bookID){
                book=books[i];
                break;
            }
        }

        for(int i=0;i<userCount;i++){
            if(users[i].getUserId()==userID){
                user=users[i];
                break;
            }
        }

        if(book!=null && user!=null && book.getBookAvailable())
        {
            book.returnBook();
            user.returnBook();
            System.out.println("Book Returned successfully");
        }
        else {
            System.out.println("Return failed!");
        }
    }
}
