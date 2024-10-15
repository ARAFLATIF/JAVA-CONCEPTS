import java.util.Scanner;
import java.util.InputMismatchException;
//The java.util.InputMismatchException is a runtime exception in Java that is thrown by the Scanner class when the input retrieved does not match the expected type or is out of range for that type

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline left-over

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline left-over

        // Prompt the user to enter the operation
        System.out.print("What operation do you want to perform? (sum, sub, mult, div): ");
        String operation = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

        // Use a switch statement to handle different operations
        switch (operation) {
            case "sum":
                // Perform addition
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break;
            case "sub":
                // Perform subtraction
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;
            case "mult":
                // Perform multiplication
                System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
                break;
            case "div":
                // Perform division, check for division by zero
                if (number2 == 0) {
                    System.out.println("Can't divide by zero");
                } else {
                    System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
                }
                break;
            default:
                // Handle unsupported operations
                System.out.printf("%s is not a supported operation.", operation);
                break;
        }

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}
