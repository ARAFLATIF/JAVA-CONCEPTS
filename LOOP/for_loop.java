// Example 1: Simple For Loop
// This example demonstrates a basic for loop that prints numbers from 1 to 10.

public class SimpleForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

//OUTPUT:
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


// Example 2: For Loop with Array
// This example shows how to use a for loop to iterate over an array and print its elements.

public class ForLoopWithArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

//OUTPUT:

// 1
// 2
// 3
// 4
// 5

// Example 3: Nested For Loops
// This example demonstrates nested for loops to print a simple matrix.

public class NestedForLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "x" + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }
    }
}

//OUTPUT:

// 1x1 = 1 1x2 = 2 1x3 = 3 
// 2x1 = 2 2x2 = 4 2x3 = 6 
// 3x1 = 3 3x2 = 6 3x3 = 9

// Example 4: For Loop with Break and Continue
// This example shows how to use break and continue statements within a for loop.

public class ForLoopWithBreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(i);
        }
    }
}

//OUTPUT:
// 1
// 3

// In this example:
// The break statement exits the loop when i reaches 5.
// The continue statement skips the execution of the current iteration when i is an even number.

// Example 5: For Loop with Labels
// This example demonstrates the use of labeled for loops, which can be useful for nested loops.

public class ForLoopWithLabels {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            innerLoop:
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break outerLoop; // Exit the outer loop when j is 2
                }
                System.out.print(i + "x" + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }
    }
}

//OUTPUT : 

// 1x1 = 1 


// In this example:
// The break outerLoop statement exits the outer loop when j is 2.
// These examples cover various scenarios of using for loops in Java, 
//   including simple loops, loops with arrays, nested loops, and loops with control statements like break and continue.

  
