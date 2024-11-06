// Example 1: Copying an Array with the Same Length
// This example demonstra tes how to create a copy of an array with the same length as the original array.

import java.util.Arrays;

public class CopyArraySameLength {
    public static void main(String[] args) {
        // Initialize the original array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Create a copy of the array with the same length
        int[] copyArray = Arrays.copyOf(originalArray, originalArray.length);

        // Print the copied array
        System.out.println("Copied Array: " + Arrays.toString(copyArray));
    }
}

//OUTPUT : Original Array: [1, 2, 3, 4, 5]
// Copied Array: [1, 2, 3, 4, 5]


// Example 2: Copying an Array with a Larger Length
// This example shows how to create a copy of an array with a larger length than the original array.
//   The extra elements are padded with the default value (0 for int).


import java.util.Arrays;

public class CopyArrayLargerLength {
    public static void main(String[] args) {
        // Initialize the original array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Create a copy of the array with a larger length
        int[] copyArray = Arrays.copyOf(originalArray, 10);

        // Print the copied array
        System.out.println("Copied Array: " + Arrays.toString(copyArray));
    }
}

//OUTPUT : Original Array: [1, 2, 3, 4, 5]
// Copied Array: [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]


// Example 3: Copying an Array with a Smaller Length
// This example demonstrates how to create a copy of an array with a smaller length than the original array.
//   The copy is truncated to the specified length.

import java.util.Arrays;

public class CopyArraySmallerLength {
    public static void main(String[] args) {
        // Initialize the original array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Create a copy of the array with a smaller length
        int[] copyArray = Arrays.copyOf(originalArray, 3);

        // Print the copied array
        System.out.println("Copied Array: " + Arrays.toString(copyArray));
    }
}

//OUTPUT : Original Array: [1, 2, 3, 4, 5]
// Copied Array: [1, 2, 3]

// Example 4: Copying an Array of Objects
// When copying an array of objects, the Arrays.copyOf() method performs a shallow copy,
//   meaning it copies the references to the objects, not the objects themselves.

import java.util.Arrays;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }
}

public class CopyArrayObjects {
    public static void main(String[] args) {
        // Initialize the original array of objects
        Person[] originalArray = {new Person("Alice"), new Person("Bob"), new Person("Charlie")};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Create a copy of the array of objects
        Person[] copyArray = Arrays.copyOf(originalArray, originalArray.length);

        // Print the copied array
        System.out.println("Copied Array: " + Arrays.toString(copyArray));

        // Modify an object in the original array
        originalArray[0].name = "Diana";

        // Print both arrays after modification
        System.out.println("Original Array after modification: " + Arrays.toString(originalArray));
        System.out.println("Copied Array after modification: " + Arrays.toString(copyArray));
    }
}

//OUTPUT : Original Array: [Person{name='Alice'}, Person{name='Bob'}, Person{name='Charlie'}]
// Copied Array: [Person{name='Alice'}, Person{name='Bob'}, Person{name='Charlie'}]
// Original Array after modification: [Person{name='Diana'}, Person{name='Bob'}, Person{name='Charlie'}]
// Copied Array after modification: [Person{name='Diana'}, Person{name='Bob'}, Person{name='Charlie'}]
