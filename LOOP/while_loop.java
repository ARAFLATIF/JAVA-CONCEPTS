// Example 1: Simple While Loop
// This example demonstrates a basic while loop that prints numbers from 1 to 10

public class SimpleWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}

//OUTPUT : 

// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10


// Example 2: While Loop with Array
// This example shows how to use a while loop to iterate over an array and print its elements.

public class WhileLoopWithArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }
}

//OUTPUT : 1
// 2
// 3
// 4
// 5

// Example 3: Nested While Loops
// This example demonstrates nested while loops to print a simple matrix.

public class NestedWhileLoops {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.print(i + "x" + j + " = " + (i * j) + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

//OUTPUT : 1x1 = 1 1x2 = 2 1x3 = 3 
// 2x1 = 2 2x2 = 4 2x3 = 6 
// 3x1 = 3 3x2 = 6 3x3 = 9 

// Example 4: While Loop with Break and Continue
// This example shows how to use break and continue statements within a while loop.

public class WhileLoopWithBreakAndContinue {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            if (i % 2 == 0) {
                i++; // Skip even numbers
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}

//OUTPUT : 
// 1
// 3

// In this example:
// The break statement exits the loop when i reaches 5.
// The continue statement skips the execution of the current iteration when i is an even number.

// Example 5: While Loop for User Input
// This example demonstrates how to use a while loop to continuously prompt the user for input until a certain condition is met.

import java.util.Scanner;

public class WhileLoopForUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.print("Enter a number (or -1 to exit): ");
            int number = scanner.nextInt();

            if (number == -1) {
                continueLoop = false;
            } else {
                System.out.println("You entered: " + number);
            }
        }

        scanner.close();
    }
}

// In this example, the while loop continues to prompt the user for input until the user enters -1, at which point the loop exits.
// These examples illustrate various ways to use while loops in Java, including simple loops, loops with arrays,
//   nested loops, and loops with control statements like break and continue.
