package week2;

public class lg2 {
    public static void main(String[] args) {
        // exception handling
        // int myInt = Integer.parseInt("s");
        // System.out.println(myInt);
        try {
            int myInt = Integer.parseInt("5");
            System.out.println(myInt);
        }
        catch(NumberFormatException nfe){
            System.out.println("Enter a number");
        }
        finally{ // finally statement always runs
            System.out.println("Good");
        }

    }
}
