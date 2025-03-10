package week05;

public class oop {
    public static void main(String[] args) {
        user u = new user();
        u.name = "Blazzard";
        u.membership = "Gold";

        user u2 = new user();
        u2.name = "Heather";
        u2.membership = "Platinum";

        System.out.println(u.name);
        System.out.println(u2.name);
    }
}
