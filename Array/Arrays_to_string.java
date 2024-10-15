// In Java, the Arrays.toString() method is a static method from the java.util.Arrays class that converts the elements of an array into a string representation. 
//   Here’s a detailed explanation and an example:
// Why Use Arrays.toString()
// The default toString() method in Java does not work as expected for arrays. Instead of providing a human-readable string, 
//   it returns a string that includes the type of the array and its hash code, which is not useful for most purposes5.
// How Arrays.toString() Works
// The Arrays.toString() method takes an array as an argument and returns a string that represents the contents of the array. Here are the key points:
// The string representation consists of a list of the array's elements, enclosed in square brackets [].
// Adjacent elements are separated by a comma followed by a space , .
// If the array is null, it returns the string "null"134.
// Example
// Here is an example of using Arrays.toString() to convert an array of characters into a string:

import java.util.Arrays;

public class ArrayToStringExample {
    public static void main(String[] args) {
        // Declare and initialize a character array
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // Use Arrays.toString() to convert the array to a string
        String vowelString = Arrays.toString(vowels);

        // Print the string representation of the array
        System.out.println("The vowels array as a string: " + vowelString);
    }
}

// Output
// When you run this program, you will see the following output:
// text
// The vowels array as a string: [a, e, i, o, u]

// Overloaded Variants
// The Arrays.toString() method is overloaded to support various types of arrays, including:
// boolean[]
// byte[]
// char[]
// double[]
// float[]
// int[]
// long[]
// short[]
// Object[]
// Here is an example with different types of arrays:

import java.util.Arrays;

public class ArrayToStringExample {
    public static void main(String[] args) {
        boolean[] boolArr = {true, true, false, true};
        char[] charArr = {'g', 'e', 'e', 'k', 's'};
        double[] dblArr = {1.0, 2.0, 3.0, 4.0};
        int[] intArr = {1, 2, 3, 4};
        Object[] objArr = {1, 2, 3, 4};

        System.out.println("Boolean Array: " + Arrays.toString(boolArr));
        System.out.println("Character Array: " + Arrays.toString(charArr));
        System.out.println("Double Array: " + Arrays.toString(dblArr));
        System.out.println("Integer Array: " + Arrays.toString(intArr));
        System.out.println("Object Array: " + Arrays.toString(objArr));
    }
}

// Output
// text
// Boolean Array: [true, true, false, true]
// Character Array: [g, e, e, k, s]
// Double Array: [1.0, 2.0, 3.0, 4.0]
// Integer Array: [1, 2, 3, 4]
// Object Array: [1, 2, 3, 4]

// Using Arrays.toString() is a convenient and readable way to convert arrays into string representations in Java.
