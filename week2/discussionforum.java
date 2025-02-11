package week2;
import java.util.Scanner;

public class discussionforum {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        //while loop
        String input = "";
        while (!input .equals("exit")) {
            System.out.println("Enter input ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        }

        // do-while loop
        int choice;
        do {
            System.out.println("Enter your guess between 0 to 9");
            choice = scanner.nextInt();
        }
        while (choice != 2);
    }
}
