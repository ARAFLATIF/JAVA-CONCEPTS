// //The java.util.InputMismatchException is a runtime exception in Java that is thrown by the Scanner class when the input retrieved does not match the expected type
//or is out of range for that type. Here’s a detailed explanation:
// What Causes InputMismatchException
// This exception occurs when the user provides input that does not match the type expected by the 
//Scanner method. For example, if a program uses scanner.nextInt() to read an integer but the user enters a string, an InputMismatchException is thrown156.
// Example Scenario:

import java.util.Scanner;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer = scanner.nextInt(); // If user enters a string, InputMismatchException is thrown
        scanner.close();
    }
}

// How to Fix InputMismatchException
// To avoid or handle this exception, you can use several strategies:
// Ensure Correct Input Type
// Make sure the user input matches the type expected by the Scanner method. For instance, if you expect an integer, ensure the user enters a valid integer15.
// Use Exception Handling
// Use a try-catch block to catch the InputMismatchException and handle it appropriately. Here’s an example:

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int integer = 0;

        while (!validInput) {
            try {
                System.out.println("Enter an integer: ");
                integer = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input from the buffer
            }
        }
        scanner.close();
        System.out.println("You entered: " + integer);
    }
}

// Use Exception Handling
// Use a try-catch block to catch the InputMismatchException and handle it appropriately. Here’s an example:
// java

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int integer = 0;

        while (!validInput) {
            try {
                System.out.println("Enter an integer: ");
                integer = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input from the buffer
            }
        }
        scanner.close();
        System.out.println("You entered: " + integer);
    }
}

// Clear the Input Buffer
// When an InputMismatchException occurs, the invalid input remains in the buffer. You need to clear this buffer using scanner.next() or scanner.nextLine() to avoid an endless loop of exceptions2
// 3.
// Characteristics of InputMismatchException
// Unchecked Exception: InputMismatchException is a subclass of java.lang.RuntimeException, which means it does not need to be declared in the throws clause of a method or constructor156.
// Methods: It inherits all the methods from java.lang.Throwable and java.lang.Object classes, such as getMessage(), printStackTrace(), etc.6.
// By understanding and handling InputMismatchException properly, you can ensure that your Java programs robustly handle user input and provide a better user experience.
