package exercise.codingwithjohn;

import java.util.ArrayList;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // ArraysVsArrayList
        // single-dimensional arrays in java
        // Null - value of an object that references nothing String text;
        //Arrays is a collection if variables of the same data type, array size is fixed
        // create array - datatype[] arrayName;
        // int [] numbers = new int [5]; // {0,0,0,0,0}

        //Default Values
        // numeric data types - 0
        // char data types -\000(after the \ there's a u)
        // boolean data types - false

        //Access array elements uses brackets and indices
        // numbers[0] = 5; // {5,0,0,0,0}

        // double[] numbers2 = {1.9, 3.1, 2.7, 9.6, 8.3};

        // numbers and numbers2 are the same, difference is that they have been initialized differently

        //printing arrays
        // System.out.println(numbers2); // this will print array address

        // for(int i = 0; i<numbers2.length; i++){
            // System.out.println(numbers2[i]); // this will print the items in the array
        // }

        // single dimensional array part2
        // anonymous array
        // new int[] {1,2,3,4};

        // Exceeding Array Bounds
        // char[] chars = {'a', 'b', 'c', 'd'};
        // System.out.println(chars[-1]);

        //passing arrays to methods
        // int[] numbers3 = {0,1};

        // array store multiple values in a single variable

        // String[] car = {"camero"};
        // System.out.println(car);

        // String [] cars2 = new String[8];
        // cars2 [6] = "BMW";
        // for(int i = 0; i< cars2.length; i++){
        //     System.out.println(cars2[i]);
        // }

        // 2d arrays
        // array of an arrays
        // String[][] houses = new String[3][3];

        // houses[0][0] = "Penthouse";
        // houses[0][1] = "Manyatta";
        // houses[0][2] = "Mud";
        // houses[1][0] = "Ploti";
        // houses[1][1] = "Pipu";
        // houses[1][2] = "Utawala";
        // houses[2][0] = "ByPass";
        // houses[2][1] = "Njiru";
        // houses[2][2] = "Chokaa";
        
        // for (int i = 0; i<houses.length; i++){
        //     System.out.println();
        //     for (int j=0;j<houses[i].length; j++){
        //         System.out.println(houses[i][j]+"");
        //     }
        // }
        
        //2d arrays
        // int[][] integers = {{3,5,7}, {10,2,9}};
        // for (int i = 0; i < integers[0].length; i++){
            // System.out.println();
            // for (int j = 0; j <integers.length; j++){
                // System.out.println(integers[i][j]);
            // }
        // }
        // int [][] integers = {{5,5,7},{2,9,8}};
        // for (int i = 0; i < 2; i++){
        //     for (int j = 0; j < 3; j++){
        //         System.out.println(integers[i][j]);

        //     System.out.println();
        //     };
        // };

        // int [][] coins = {
        //     {3,5,7},
        //     {10,2,9}
        // };
        // for (int j = 0; j < 3; j++){
        //     for (int i = 0; i < 2; i++){
        //         System.out.println(coins[i][j]+"");
        //     System.out.println();
        //     };
        // };
        // deep to string method
        // System.out.println(Arrays.deepToString(coins));

        // 2d arrays part 3
        // 2d array with rows of different length are called ragged arrays

        // int [][] integers = {
        //     {1,2,3},
        //     {5,6},
        //     {7,8,9,4,10}
        // };

        // for (int i = 0; i < 3; i++){
        //     for (int j = 0; j < integers[i].length; j++){
        //         System.out.println(integers[i][j]);
        //     };
        // };

        // for (int j = 0; j < integers[i].length; j++){
        //     for (int i = 0; i < 3; i++){
        //         System.out.println(integers[i][j]);
        //     }
        // };

        // Arraylist in Java
        // a resizable array
        // ArrayList <Integer> integers; // null
        // integers = new ArrayList<>();

        ArrayList <Integer> integers = new ArrayList<>();
        integers.add(9);
        integers.add(0,2); // specifying index where item should be added.

        System.out.println(integers.get(0));// getting an item

        integers.set(0,9); // setting an item to a particular index

        integers.remove(0); // removing an item by index

        integers.remove(9); // removing by value

        integers.clear(); // remove evrything

        integers.size(); // getting the size of the arraylist

        // array list has a dynamic size, can be changed

        
    }
}
