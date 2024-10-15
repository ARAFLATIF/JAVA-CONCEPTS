// Example: Simple Do-While Loop
// This example demonstrates a do-while loop that prints numbers from 1 to 5.

public class SimpleDoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}

//OUTPUT:
// 1
// 2
// 3
// 4
// 5

// Explanation
// Initialization: The variable i is initialized to 1.
// Do Block: The code inside the do block is executed first, printing the value of i.
// Increment: The value of i is incremented by 1.
// While Condition: The loop continues as long as the condition i <= 5 is true.
// Repeat: Steps 2-4 are repeated until the condition is false.

// Example with User Input
// Here is another example that uses a do-while loop to continuously prompt the user for input until a valid choice is made.


import java.util.Scanner;

public class DoWhileLoopWithUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter your choice (1, 2, or 3): ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("You chose option 1");
            } else if (choice == 2) {
                System.out.println("You chose option 2");
            } else if (choice == 3) {
                System.out.println("You chose option 3");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 1 && choice != 2 && choice != 3);

        scanner.close();
    }
}

//OUTPUT :

// Enter your choice (1, 2, or 3): 4
// Invalid choice. Please try again.
// Enter your choice (1, 2, or 3): 2
// You chose option 2

// In this example, the do-while loop ensures that the user is prompted at least once
//   and continues to prompt until a valid choice (1, 2, or 3) is made.
