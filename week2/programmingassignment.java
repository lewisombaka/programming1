package week2;
import java.util.Scanner;

public class programmingassignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our Library \n What is your name: ");
        String jina = scanner.nextLine();

        boolean start = true;

        while(start){
            try {
                System.out.println("How would you like us to help you? \n 1) Press 1 to ADD Books \n 2) Press 2 to BORROW Books \n 3) Press 3 to RETURN Books \n 0) Press 0 to EXIT");
                int selection = scanner.nextInt();
                if (selection == 1){
                    System.out.println("1");
                }
                else if (selection == 2){
                    System.out.println("1");
                }
                else if (selection == 3){
                    System.out.println("3");
                }
                else if (selection == 0){
                    System.out.println("Thank You for Visisting us, Goodbye "+jina);
                    start = false;
                }
                else {
                    System.out.println(jina+", The selection you have made is invalid");
                }
            }
            catch (Exception e){
                System.out.println(jina+", Please eneter a number");
                scanner.nextLine(); // clearing the value
            }
        }
    }
}
