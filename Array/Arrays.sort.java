// IntegersSorting an Array of 

import java.util.Arrays;

public class IntegerSortExample {
    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[] numbers = {50, 10, 25, 1, 17, 99, 33};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Sort the array using Arrays.sort()
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}

// Output:
// Original Array: [50, 10, 25, 1, 17, 99, 33]
// Sorted Array: [1, 10, 17, 25, 33, 50, 99]



// Sorting an Array of Strings

import java.util.Arrays;

public class StringSortExample {
    public static void main(String[] args) {
        // Declare and initialize a string array
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(fruits));

        // Sort the array using Arrays.sort()
        Arrays.sort(fruits);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(fruits));
    }
}

// Output:
// Original Array: [Apple, Banana, Cherry, Date, Elderberry]
// Sorted Array: [Apple, Banana, Cherry, Date, Elderberry]


// Sorting a Subarray
// If you want to sort only a part of the array, you can use the overloaded Arrays.sort() method that takes additional parameters for the start and end indices.


import java.util.Arrays;

public class SubarraySortExample {
    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[] numbers = {50, 10, 25, 1, 17, 99, 33};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Sort a subarray from index 1 to 4 (exclusive)
        Arrays.sort(numbers, 1, 5);

        // Print the array after sorting the subarray
        System.out.println("Array after sorting subarray: " + Arrays.toString(numbers));
    }
}


// Output:
// Original Array: [50, 10, 25, 1, 17, 99, 33]
// Array after sorting subarray: [50, 1, 10, 17, 25, 99, 33]

// In these examples, the Arrays.sort() method is used to sort the arrays in ascending order. The method is efficient and easy to use,
//   leveraging Java's built-in sorting algorithms (such as quicksort for primitive types and iterative mergesort for objects)467.
