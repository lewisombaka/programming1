package week2;
import java.util.Scanner;
import java.util.ArrayList;

public class programmingassignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>(); 

        System.out.println("Welcome to our Library \nWhat is your name: ");
        String jina = scanner.nextLine();

        boolean start = true;

        while(start){
            try {
                System.out.println("How would you like us to help you? \n1) Press 1 to ADD Books \n2) Press 2 to BORROW Books \n3) Press 3 to RETURN Books \n4) Press 4 to VIEW books in library \n0) Press 0 to EXIT");
                int selection = scanner.nextInt();
                scanner.nextLine(); 

                if (selection == 1){
                    System.out.println("Which book do you want to ADD? ");
                    String book = scanner.nextLine();

                    System.out.println("Who is the author of " + book + "?");
                    String author = scanner.nextLine();

                    System.out.println("How many do you want to add? ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); 

                    for (int i = 1; i<=quantity;i++){
                        books.add(book);
                    } 

                    System.out.println(book + " by " + author + " has been added to the Library.");
                }
                else if (selection == 2){
                    System.out.println("Which book do you want to BORROW");
                    String borrow = scanner.nextLine();
                    for (int i = 0; i<= books.size(); i++){
                        if (books.get(i)==borrow){
                            books.remove(borrow);
                        }
                    }
                }
                else if (selection == 3){
                    System.out.println("3");
                }
                else if (selection == 4){
                    System.out.println("Books in Library: " + books); 
                }
                else if (selection == 0){
                    System.out.println("Thank You for Visiting us, Goodbye " + jina);
                    start = false;
                }
                else {
                    System.out.println(jina + ", The selection you have made is invalid.");
                }
            }
            catch (Exception e){
                System.out.println(jina + ", Please enter a number.");
                scanner.nextLine(); 
            }
        }
    }
}
