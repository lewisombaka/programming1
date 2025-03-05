package exercise.codingwithjohn;

public class arrays {
    public static void main(String[] args) {
        // ArraysVsArrayList
        // single-dimensional arrays in java
        // Null - value of an object that references nothing String text;
        //Arrays is a collection if variables of the same data type, array size is fixed
        // create array - datatype[] arrayName;
        int [] numbers = new int [5]; // {0,0,0,0,0}

        //Default Values
        // numeric data types - 0
        // char data types -\000(after the \ there's a u)
        // boolean data types - false

        //Access array elements uses brackets and indices
        numbers[0] = 5; // {5,0,0,0,0}

        double[] numbers2 = {1.9, 3.1, 2.7, 9.6, 8.3};

        // numbers and numbers2 are the same, difference is that they have been initialized differently

        //printing arrays
        // System.out.println(numbers2); // this will print array address

        for(int i = 0; i<numbers2.length; i++){
            // System.out.println(numbers2[i]); // this will print the items in the array
        }

        // single dimensional array part2
        // anonymous array
        // new int[] {1,2,3,4};

        // Exceeding Array Bounds
        char[] chars = {'a', 'b', 'c', 'd'};
        // System.out.println(chars[-1]);

        //passing arrays to methods
        int[] numbers3 = {0,1};

        
        
    }
}
