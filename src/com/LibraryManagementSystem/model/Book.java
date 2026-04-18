package com.LibraryManagementSystem.model;

public class Book {

    private int bookId;

    private String bookName;

    private String BookAuthor;


    private Boolean bookAvailable =true;


    public Book(int id, String name, String author, Boolean available) {
       this.bookId = id;
       this.bookName = name;
       this.BookAuthor = author;
    }

    public Boolean getBookAvailable() {
        return bookAvailable;
    }


    public int getBookId() {
        return bookId;
    }


    public String getBookName() {
        return bookName;
    }


    public String getBookAuthor() {
        return BookAuthor;
    }



    public void markedIssue()
    {
        this.bookAvailable =false;
    }
    public void returnBook()
    {
        this.bookAvailable =true;
    }

    public void displayBook()
    {
        System.out.println("Id: "+ bookId +"\nBook Name: "+this.bookName +"\nBook Author: "+this.BookAuthor+"\nBook Available: "+this.bookAvailable);
    }


}
