package com.LibraryManagementSystem.Main;

import com.LibraryManagementSystem.model.Book;
import com.LibraryManagementSystem.model.User;
import com.LibraryManagementSystem.service.Library;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Library library=new Library();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("\n------------Menu-------------");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. View Books");
            System.out.println("4. View Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Quit");

            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Book Id: ");
                    int bookId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Book Name:");
                    String bookName=sc.nextLine();
                    System.out.println("Enter Book Author:");
                    String bookAuthor=sc.nextLine();

                    Book book=new Book(bookId,bookName,bookAuthor);
                    library.addBook(book);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.println("Enter User Id: ");
                    int userId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter User Name: ");
                    String userName=sc.nextLine();

                    User user=new User(userId,userName);
                    library.addUser(user);
                    System.out.println("User added successfully!");
                    break;

                 case 3:
                     library.viewBooks();
                     break;

                 case 4:
                     library.viewUsers();
                     break;

                 case 5:

                     System.out.println("Enter User Id: ");
                     int userId2 =sc.nextInt();
                     System.out.println("Enter Book Id: ");
                     int bookId2=sc.nextInt();
                     library.issueBook(userId2,bookId2);
                     break;

                 case 6:
                     System.out.println("Enter User Id: ");
                     int userId3 =sc.nextInt();
                     System.out.println("Enter Book Id: ");
                     int bookId3=sc.nextInt();
                     library.returnBook(userId3,bookId3);
                     break;

                 case 7:
                     System.out.println("Exiting......");
                     System.exit(0);

                default:
                         System.out.println("Invalid choice!");


            }
        }
    }
}