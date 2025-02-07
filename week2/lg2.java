package week2;
import java.util.Scanner;
public class lg2 {
    public static void main(String[] args) {
        // exception handling
        // int myInt = Integer.parseInt("s");
        // System.out.println(myInt);
        // try {
        //     int myInt = Integer.parseInt("5");
        //     System.out.println(myInt);
        // }
        // catch(NumberFormatException nfe){
        //     System.out.println("Enter a number");
        // }
        // finally{ // finally statement always runs
        //     System.out.println("Good");
        // }

        // Do while loop
        // int i = 1;
        // System.out.println("do While");
        // do {
        //     System.out.println("Hello" + i);
        //     i++;
        // }
        // // int j = 1;
        // while (i<=3);
        // int j = 1;
        // while (j<=3){
        //     System.out.println("Hello"+j);
        //     j++;
        // }

        // Excersise
        Scanner scanner = new Scanner (System.in);

        int number = 2;
        while (number > 10 || number < 1) {
            System.out.println("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        }
        System.out.println(number + " is between 1 to 10");

        int number2;
        do {
            System.out.println("Enter number2: ");
            number2 = scanner.nextInt();
        }
        while(number2<1||number2>10);
    }
}
