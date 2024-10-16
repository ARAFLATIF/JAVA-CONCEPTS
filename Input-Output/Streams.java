In Java, I/O streams are used to read and write data as a sequence of bytes. Here are the key points:
Console Input/Output/Error Streams
Console Input: System.in (also known as STDIN) is used to read input from the keyboard.
Console Output: System.out (also known as STDOUT) is used to write output to the console.
Console Error: System.err (also known as STDERR) is used to write error messages to the console.
Using java.util.Scanner for Input
The java.util.Scanner class is widely used to read input from various sources, including the console.


  Example Program Using Scanner
Here is a simple Java program that demonstrates how to use Scanner to read input from the console:

THE CODE : 

  import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to read from System.in (console input)
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");

        // Read an integer using nextInt()
        int i = in.nextInt();

        // Check if the input is positive
        if (i <= 0) {
            System.err.println("That's not positive!"); // Use System.err for error messages
        } else {
            System.out.println("You entered: " + i);
        }

        // Read a string using nextLine()
        System.out.print("Enter your name: ");
        String name = in.nextLine(); // Note: nextLine() reads the entire line
        System.out.println("Hello, " + name + "!");

        // Close the Scanner to prevent resource leaks
        in.close();
    }
}




Using System.console() for Input
Alternatively, you can use the System.console() method to read input from the console. Here’s how you can do it:


THE CODE :
  import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        // Get the console object
        Console console = System.console();

        if (console!= null) {
            // Prompt the user to enter their name
            String name = console.readLine("Enter your name: ");
            console.printf("Hello, %s!\n", name);
        } else {
            System.out.println("Console is not available.");
        }
    }
}



Formatting Output Using System.out.printf and String.format
Java provides methods to format output using printf codes similar to those in C.
  
Example Program Using printf
Here is an example of how to use System.out.printf and String.format:

THE CODE :

  public class PrintfExample {
    public static void main(String[] args) {
        // Using System.out.printf
        System.out.printf("The answer is %d\n", 42);

        // Using String.format
        String formattedString = String.format("The answer is %d", 42);
        System.out.println(formattedString);
    }
}




StringBuilder for Efficient String Manipulation
When manipulating text, using StringBuilder is more efficient than concatenating String objects.
Example Program Using StringBuilder
Here is an example of how to use StringBuilder:

THE CODE :

  public class StringBuilderExample {
    public static void main(String[] args) {
        // Using String concatenation (inefficient)
        String str = "Hello";
        for (int i = 0; i < 10; i++) {
            str += " World";
        }
        System.out.println(str);

        // Using StringBuilder (efficient)
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 10; i++) {
            sb.append(" World");
        }
        System.out.println(sb.toString());
    }
}



Explanation of the Concepts
  
I/O Streams:
System.in, System.out, and System.err are pre-defined streams for reading input, writing output, and writing error messages, respectively.
These streams are used as the source or destination for various I/O operations.
Scanner Class:
The Scanner class is used to parse input from various sources, including the console (System.in).
Methods like nextInt(), nextLine(), and next() are used to read different types of input.
It is important to close the Scanner object to prevent resource leaks.
Console Class:
The System.console() method provides a way to read input from the console.
It is useful when you need to read sensitive information like passwords.
Formatting Output:
System.out.printf and String.format allow you to format output using printf codes.
This is useful for creating formatted strings and output.
StringBuilder:
StringBuilder is more efficient than concatenating String objects because it avoids creating multiple temporary objects.
It is particularly useful when performing multiple string manipulations in a loop.
