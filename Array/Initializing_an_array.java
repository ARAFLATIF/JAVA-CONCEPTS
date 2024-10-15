public class VowelArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // Print the array elements
        System.out.println("The vowels are:");
        for (char vowel : vowels) {
            System.out.println(vowel);
        }
    }
}

// Explanation
// Array Declaration and Initialization:
// java
// char[] vowels = {'a', 'e', 'i', 'o', 'u'};

// This line declares and initializes an array named vowels with the characters 'a', 'e', 'i', 'o', and 'u'.
// Printing Array Elements:
// java
// for (char vowel : vowels) {
//     System.out.println(vowel);
// }

// This for-each loop iterates over each element in the vowels array and prints it.
// Output
// When you run this program, you will see the following output:
// text
// The vowels are:
// a
// e
// i
// o
// u

// This program demonstrates how to declare, initialize, and print the elements of a character array in Java.
