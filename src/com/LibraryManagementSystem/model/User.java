package com.LibraryManagementSystem.model;

public class User {

    private final int userId;
    private final String userName;
    private int bookIssueCount;

    public User(int id,String name) {
        this.userId = id;
        this.userName = name;
        this.bookIssueCount = 0;

    }
    public int getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }

    public int getBookIssueCount() {
        return bookIssueCount;
    }



    public void issueBook()
    {
        bookIssueCount++;
    }

    public void returnBook()
    {
        if(bookIssueCount >0)
            {
            bookIssueCount--;
            }

    }

    public void dispayUser()
    {
        System.out.println("User Id: "+userId+"\nUser Name: "+userName+"\nNumber Of Book Issued: "+ bookIssueCount);
    }



}
