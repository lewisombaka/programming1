package exercise;

public class classes {
    public static void main(String[] args){
        // classes and objects
        // class has instances(str and int) and methods
        // class should be single entity - if it's a class that contains people then it should not contain animals
        pokemon p1 = new pokemon();
        p1.level = 23;
        p1.name = "Pikachu";

        System.out.println(p1.name+" "+p1.level);
    }
}
