package exercise;

public class classes {
    public static void main(String[] args){
        // classes and objects
        // class has instances(str and int) and methods
        // class should be single entity - if it's a class that contains people then it should not contain animals
        pokemon p1 = new pokemon("Pikachu", 23);
        // p1.level = 23;
        // p1.name = "Pikachu";

        System.out.println(p1.name+" "+p1.level);

        pokemon p2 = new pokemon("eeevu", 12);
        // p2.name = "eeevu";
        p2.attack();

        pokemon p3 = new pokemon("Lewis", 25);
        System.out.println(p3.level);
    }
}
