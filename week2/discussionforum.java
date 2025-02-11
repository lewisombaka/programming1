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
            System.out.println("Enter any Number to start and 0 to exit");
            choice = scanner.nextInt();
        }
        while (choice != 0);

        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration "+i);
        }
    }
}
