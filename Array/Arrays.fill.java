// Filling an Entire Array
// This example demonstrates how to fill an entire array with a single value.

import java.util.Arrays;

public class FillEntireArray {
    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[] numbers = new int[10];

        // Fill the entire array with the value 5
        Arrays.fill(numbers, 5);

        // Print the filled array
        System.out.println("Filled Array: " + Arrays.toString(numbers));
    }
}

//OUTPUT : Filled Array: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]


// Filling a Character Array
// Here is an example of filling a character array

import java.util.Arrays;

public class FillCharacterArray {
    public static void main(String[] args) {
        // Declare and initialize a character array
        char[] vowels = new char[5];

        // Fill the entire array with the character 'a'
        Arrays.fill(vowels, 'a');

        // Print the filled array
        System.out.println("Filled Array: " + Arrays.toString(vowels));
    }
}

//OUTPUT : Filled Array: [a, a, a, a, a]


// Filling a String Array
// This example demonstrates filling a string array.

import java.util.Arrays;

public class FillStringArray {
    public static void main(String[] args) {
        // Declare and initialize a string array
        String[] fruits = new String[5];

        // Fill the entire array with the string "Kiwi"
        Arrays.fill(fruits, "Kiwi");

        // Print the filled array
        System.out.println("Filled Array: " + Arrays.toString(fruits));
    }
}

//OUTPUT : Filled Array: [Kiwi, Kiwi, Kiwi, Kiwi, Kiwi]

// Filling a Multidimensional Array
// To fill a multidimensional array, you need to use a loop to fill each row or column. Here is an example of filling a 2D array:

import java.util.Arrays;

public class Fill2DArray {
    public static void main(String[] args) {
        // Declare and initialize a 2D integer array
        int[][] matrix = new int[3][4];

        // Fill each row with the value 10
        for (int[] row : matrix) {
            Arrays.fill(row, 10);
        }

        // Print the filled 2D array
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

//OUTPUT : [10, 10, 10, 10]
// [10, 10, 10, 10]
// [10, 10, 10, 10]
