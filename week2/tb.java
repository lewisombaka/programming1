package week2;
import java.util.Scanner;

public class tb {
    public static void main (String[] args) {
        // while and do while
        Scanner scanner = new Scanner (System.in);
        // int inputNumber;   // One of the integers input by the user.
        // int sum;           // The sum of the positive integers.
        // int count;         // The number of positive integers.
        // double average;    // The average of the positive integers.
        //     sum = 0;
        // count = 0;
        
        // /* Read and process the user's input. */
        
        // System.out.print("Enter your first positive integer: ");
        // inputNumber = scanner.nextInt();
        
        // while (inputNumber != 0) {
        //     sum += inputNumber;   // Add inputNumber to running sum.
        //     count++;              // Count the input by adding 1 to count.
        //     System.out.print("Enter your next positive integer, or 0 to end: ");
        //     inputNumber = scanner.nextInt();
        // }
        
        // /* Display the result. */
        
        // if (count == 0) {
        //     System.out.println("You didn't enter any data!");
        // }
        // else {
        //     average = ((double)sum) / count;
        //     System.out.println();
        //     System.out.println("You entered " + count + " positive integers.");
        //     System.out.printf("Their average is %1.3f.\n", average);
        // }

        // boolean start = false;
        // int count = 0;
        // int sum = 0;

        // while(start){
        //     System.out.println("Enter number");
        //     int number = scanner.nextInt(); 
        //     if (number != 0){
        //         count+=1;
        //         sum+=number;
        //     }
        //     else{
        //         start = false;
        //     }
        // }
        // int average = sum/count;
        // System.out.println("You've entered "+count+" numbers");
        // System.out.println("The average of your numbers is "+average);


        //game-playing program using a do-while
        // String begin;
        // do{
        //     System.out.println("What is your name? ");
        //     String name = scanner.nextLine();
        //     System.out.println("Your name is "+name);
        //     System.out.println(("Do you want to play again? "));
        //     begin = scanner.nextLine();
        // }
        // while(begin.equalsIgnoreCase("Yes"));//equalsIgnoreCase

        // int count = 1;

        // do {
        //     System.out.println("Iteration: " + count);
        //     count++;
        // } while (count <= 5);

        //for statement

        for (int years=0;years<5;years++){
            System.out.println(years);
        }

        // There are 10 numbers to print.           
        // Use a for loop to count 1, 2,            
        // ..., 10.  The numbers we want            
        // to print are 2*1, 2*2, ... 2*10.         
   
        for (int N = 1; N <= 20; N++) {              
            System.out.println( 2*N );
        }

        // Use a for loop that counts
       // 2, 4, ..., 20 directly by
       // adding 2 to N each time through
       // the loop.
       
       for (int M = 2; M <= 20; M += 2) {
        System.out.println( M );
     }

    }
}
