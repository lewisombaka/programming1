package week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class programmingassignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> books = new HashMap<>();  
        Map<String, Integer> borrowedBooks = new HashMap<>(); 

        System.out.println("Welcome to our Library \nWhat is your name: ");
        String jina = scanner.nextLine();

        boolean start = true;

        while (start) {
            try {
                System.out.println("\nHow would you like us to help you?");
                System.out.println("1) Press 1 to ADD Books");
                System.out.println("2) Press 2 to BORROW Books");
                System.out.println("3) Press 3 to RETURN Books");
                System.out.println("4) Press 4 to VIEW books in the library");
                System.out.println("0) Press 0 to EXIT");
                System.out.print("Enter your choice: ");
                
                int selection = scanner.nextInt();
                scanner.nextLine();

                if (selection == 1) { 
                    // ADD BOOKS
                    System.out.print("Enter the book title: ");
                    String book = scanner.nextLine();

                    System.out.print("Enter the author's name: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter the number of copies to add: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    books.put(book, books.getOrDefault(book, 0) + quantity);
                    System.out.println(quantity + " copies of \"" + book + "\" by " + author + " have been added to the Library.");

                } else if (selection == 2) { 
                    // BORROW BOOKS
                    System.out.print("Enter the book title you want to borrow: ");
                    String borrow = scanner.nextLine();

                    if (books.containsKey(borrow) && books.get(borrow) > 0) {
                        System.out.print("Enter the number of copies to borrow: ");
                        int borrowQuantity = scanner.nextInt();
                        scanner.nextLine();

                        if (books.get(borrow) >= borrowQuantity) {
                            books.put(borrow, books.get(borrow) - borrowQuantity);
                            borrowedBooks.put(borrow, borrowedBooks.getOrDefault(borrow, 0) + borrowQuantity);
                            System.out.println("You have borrowed " + borrowQuantity + " copies of \"" + borrow + "\".");
                            
                            if (books.get(borrow) == 0) {
                                books.remove(borrow);
                            }
                        } else {
                            System.out.println("Sorry, only " + books.get(borrow) + " copies are available.");
                        }
                    } else {
                        System.out.println("Sorry, \"" + borrow + "\" is not available in the Library.");
                    }

                } else if (selection == 3) { 
                    // RETURN BOOKS
                    System.out.print("Enter the book title you want to return: ");
                    String returnBook = scanner.nextLine();

                    if (borrowedBooks.containsKey(returnBook) && borrowedBooks.get(returnBook) > 0) {
                        System.out.print("Enter the number of copies to return: ");
                        int returnQuantity = scanner.nextInt();
                        scanner.nextLine();

                        if (borrowedBooks.get(returnBook) >= returnQuantity) {
                            borrowedBooks.put(returnBook, borrowedBooks.get(returnBook) - returnQuantity);
                            books.put(returnBook, books.getOrDefault(returnBook, 0) + returnQuantity);
                            System.out.println("Thank you for returning " + returnQuantity + " copies of \"" + returnBook + "\".");

                            if (borrowedBooks.get(returnBook) == 0) {
                                borrowedBooks.remove(returnBook);
                            }
                        } else {
                            System.out.println("Error: You are trying to return more copies than you borrowed.");
                        }
                    } else {
                        System.out.println("Error: You never borrowed \"" + returnBook + "\", so you cannot return it.");
                    }

                } else if (selection == 4) { 
                    // VIEW BOOKS
                    if (books.isEmpty()) {
                        System.out.println("No books are currently available in the Library.");
                    } else {
                        System.out.println("Books in the Library:");
                        for (Map.Entry<String, Integer> entry : books.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue() + " copies");
                        }
                    }

                } else if (selection == 0) { 
                    // EXIT PROGRAM
                    System.out.println("Thank You for Visiting us, Goodbye " + jina);
                    start = false;
                } else {
                    System.out.println(jina + ", The selection you have made is invalid.");
                }
            } catch (Exception e) {
                System.out.println(jina + ", Please enter a valid number.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
