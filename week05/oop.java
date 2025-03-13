package week05;

// import exercise.pokemon;

class Classname {
    // instance variables
    int var1;
    String var2;

    // methods
    public void method1(/*parameters*/){
        //body of methods
    }
}

class Pokemon {
    String name;
    int level;
    int age;

    public void attack (){
        System.out.println(name + " Attack!");
    }
    // constructors
    // have the same name as the class name and they are default
    Pokemon(){
        age = 10;
    }
}

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

        cars vehicle = new cars();
        vehicle.Model = "Tesla";
        vehicle.Engine = "Swooosh";

        System.out.println(vehicle.Model);
        // class attributes and  methods

        // attributes are variables inside a class
    
        // methods are functionalities/behaviors of the class objects

        vehicle.start(); // instance of cars class // instance methods

        // classes and objects
        // class serves as a blue print of creating an object 
        // // object serves as an instance of a class
        // classes should be single entities

        Pokemon poki = new Pokemon(); // poki object created
        poki.name = "Pikachu";
        poki.level = 3; // using the dot notations

        System.out.println(poki.name + poki.level);
        System.out.println(poki.age);

        // constructors

        
    }

}
