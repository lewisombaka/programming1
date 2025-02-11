package week2;
import java.util.Scanner;

public class discussionforum {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        //while loop
        // String input = "";
        // while (!input .equals("exit")) {
        //     System.out.println("Enter input ");
        //     input = scanner.nextLine();
        //     System.out.println("You entered: " + input);
        // }

        // do-while loop
        // int choice;
        // do {
        //     System.out.println("Enter any Number to start and 0 to exit");
        //     choice = scanner.nextInt();
        // }
        // while (choice != 0);

        // for loop
        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("Iteration "+i);
        // }

        // System.out.println("Enter Score ");
        // int score = scanner.nextInt();
        // String grade = "";
        // if (score >= 90){
        //     grade = "A";
        // }
        // else if (score >= 80) {
        //     grade = "B";
        // }
        // else {
        //     grade = "C";
        // }

        // System.out.println("Your grade is "+ grade);

        System.out.println("enter 1 to start game and 0 to exit");
        int option = scanner.nextInt();

        switch (option) {
            case 1: System.out.println("Start Game"); break;
            case 0: System.out.println("Exit"); break;
            default: System.out.println("Invalid Choice");
        }
        
    }
}
