package week2;
import java.util.Scanner;

public class discussionforum {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        String input = "";
        while (!input .equals("exit")) {
            System.out.println("Enter input ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        }
    }
}
