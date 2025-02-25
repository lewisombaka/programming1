package exercise.telusko;

import java.util.Scanner;

public class telusko {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Num1");
        int num1 = scanner.nextInt(); 

        System.out.println("Num2");
        int num2 = scanner.nextInt();

        Calculator calc1 = new Calculator(num1,num2);
        
        System.out.println(calc1);
    } 
}
