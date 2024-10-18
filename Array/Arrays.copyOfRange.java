//Example: Copying a Range of an Array:

import java.util.Arrays;

public class CopyOfRangeExample {
    public static void main(String[] args) {
        // Initialize the original array
        int[] originalArray = {12, 13, 14, 15, 16, 17, 18};

        // Print the origin al array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Define the range to be copied (from index 2 to 6, exclusive)
        int from = 2;
        int to = 6;

        // Use Arrays.copyOfRange() to create a copy of the specified range
        int[] copiedArray = Arrays.copyOfRange(originalArray, from, to);

        // Print the copied array
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}

//OUTPUT : Original Array: [12, 13, 14, 15, 16, 17, 18]
// Copied Array: [14, 15, 16, 17]

// Explanation
// Original Array: The array originalArray is initialized with the elements {12, 13, 14, 15, 16, 17, 18}.
// Range Specification: The from index is set to 2 and the to index is set to 6. This means the range from index 2 (inclusive) to index 6 (exclusive) will be copied.
// Arrays.copyOfRange(): The method Arrays.copyOfRange(originalArray, from, to) creates a new array containing the elements from index 2 to 5 of the originalArray.
// Print Copied Array: The resulting copiedArray is printed, showing the elements {14, 15, 16, 17}.


// Additional Scenarios
// Copying Beyond the Array Length
// If the to index exceeds the length of the original array,
//   the remaining elements in the copied array will be filled with the default value (0 for int).

int[] copiedArrayBeyondLength = Arrays.copyOfRange(originalArray, 2, 10);
System.out.println("Copied Array Beyond Length: " + Arrays.toString(copiedArrayBeyondLength));

//OUTPUT : Copied Array Beyond Length: [14, 15, 16, 17, 18, 0, 0, 0]


//Copying a Smaller Range
// If the range is smaller than the original array, only the specified elements are copied.

int[] copiedArraySmallerRange = Arrays.copyOfRange(originalArray, 2, 4);
System.out.println("Copied Array Smaller Range: " + Arrays.toString(copiedArraySmallerRange));

//OUTPUT : Copied Array Smaller Range: [14, 15]
