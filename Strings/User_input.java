import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your name? \n");
        String name = scanner.nextLine();
        
        System.out.println(name);
        scanner.close();
    }
}


import java.util.Scanner;

public class SimpleInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Using printf for formatted output
        System.out.printf("Welcome to the %s program!%n", "Simple Input");

        // Get user's name
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        // Get user's age
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        
        // Consume the newline left-over
        scanner.nextLine();

        // Get user's favorite color
        System.out.print("What's your favorite color? ");
        String color = scanner.nextLine();

        // Using printf to display formatted output
        System.out.printf("Hello, %s! You are %d years old and your favorite color is %s.%n", 
                          name, age, color);

        // Close the scanner
        scanner.close();
    }
}






import java.util.Scanner;

public class ParseExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Get user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get user's age using Integer.parseInt()
        System.out.print("Enter your age: ");
        String ageInput = scanner.nextLine();
        int age = Integer.parseInt(ageInput);

        // Get user's height
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        String heightInput = scanner.nextLine();
        double height = Double.parseDouble(heightInput);

        // Print formatted output using printf
        System.out.printf("Hello, %s! You are %d years old and %.2f meters tall.%n", 
                          name, age, height);

        // Demonstrate parsing with error handling
        System.out.print("Enter a number: ");
        String numberInput = scanner.nextLine();
        try {
            int number = Integer.parseInt(numberInput);
            System.out.printf("You entered the number: %d%n", number);
        } catch (NumberFormatException e) {
            System.out.println("That's not a valid integer!");
        }

        // Close the scanner
        scanner.close();
    }
}
