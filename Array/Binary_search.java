//Example: Sorting and Binary Search on Vowels

import java.util.Arrays;

public class VowelSortAndBinarySearch {
    public static void main(String[] args) {
        // Declare and initialize a character array of vowels
        char[] vowels = {'u', 'e', 'a', 'o', 'i'};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(vowels));

        // Sort the array using Arrays.sort()
        Arrays.sort(vowels);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(vowels));

        // Define the vowel to search for
        char targetVowel = 'e';

        // Perform binary search
        int result = binarySearch(vowels, targetVowel);

        if (result == -1) {
            System.out.println("Vowel not found in array");
        } else {
            System.out.println("Vowel found at index " + result);
        }
    }

    public static int binarySearch(char[] array, char x) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x) {
                return mid;
            }

            if (array[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}



//OUTPUT :

// Original Array: [u, e, a, o, i]
// Sorted Array: [a, e, i, o, u]
// Vowel found at index 1

// Explanation
// Array Initialization:
// The array vowels is initialized with the characters 'u', 'e', 'a', 'o', 'i'.
// Sorting:
// The Arrays.sort() method is used to sort the vowels array in ascending order.
// Binary Search:
// The binarySearch method is called with the sorted array and the target vowel 'e'.
// The binary search algorithm finds the index of the target vowel in the sorted array.
// This example demonstrates how to sort an array and then use binary search to efficiently find a specific element within the sorted array.
