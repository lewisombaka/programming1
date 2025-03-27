import java.util.*;

class Fruit {
    String name;
    String color;
    String taste;
    int weight;

    // parameterized constructors

    Fruit (String name, String color, String taste, int Weight){
        this.name = name;
        this.color = color;
        this.weight = Weight;
        this.taste = taste;
    }

    // method
    
    void displayInfo(){
        System.out.println("Fruit name: " + name);
        System.out.println("Fruit color: " + color);
        System.out.println("Fruit Weight: " + weight + " Grams");
        System.out.println("Fruit taste: " + taste);
    }
}

class Caar {
    String brand;
    String model;
    double engineCapacity;
    int year;

    // parameterized constructors
    Caar(String brand, String model, double engineCapacity, int year){
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.year = year;
    }

    void displayDetails(){
        System.out.println("Car brand: " + brand);
        System.out.println("Car model: " + model);
        System.out.println("Manufactured Year: " + year);
        System.out.println("Engine Capacity: " + engineCapacity);
    }
}

public class main {
    public static void main (String[] args){
        System.out.println("I am Classes and Objects");

        Fruit fruit1 = new Fruit("Apple","Red", "Sweet", 23);

        fruit1.displayInfo();

        System.out.println();

        Caar car1 = new Caar("Mercedes","GLE", 5.1, 2025);

        Caar car2 = new Caar("Toyota", "ZX", 4.5, 2023);

        car1.displayDetails();

        System.out.println();

        car2.displayDetails();

    }
}
