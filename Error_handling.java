Error Handling in Java: A Comprehensive Guide
Error handling is a crucial aspect of programming in Java, ensuring that your program can gracefully handle unexpected events and provide meaningful feedback. Here’s a detailed explanation of error handling in Java, including why exceptions are superior to error codes, how to instance, throw, catch, and handle exceptions, and more.
Why Exceptions are Superior to Error Codes
Reasons for Using Exceptions
Readability and Maintainability: Exceptions make the code more readable by separating the normal flow of the program from the error-handling logic.
Flexibility: Exceptions can be caught and handled at different levels of the call stack, allowing for more flexible error handling.
Informative Error Messages: Exceptions can provide detailed error messages and stack traces, which are invaluable for debugging.
Java Exception and Error Classes
Hierarchy
Both Exception and Error classes extend the Throwable class.
Exception is used for conditions that a reasonable application might want to catch.
Error is used for serious problems that a reasonable application should not try to catch, such as resource exhaustion or system problems125.
Types of Exceptions
Checked Exceptions: These are detected at compile time and must be explicitly handled or declared in the method signature. Examples include FileNotFoundException, IOException, and SQLException.
Unchecked Exceptions: These are detected at runtime and do not need to be explicitly handled. 
  Examples include NullPointerException, ArrayIndexOutOfBoundsException, and other subclasses of RuntimeException145.



  Throwing Exceptions
Example: Throwing an Exception : 

THE CODE : 

  public class ErrorHandling {
    public int foo(int data) {
        if (data > 10) {
            throw new Exception("bad data"); // Throw an exception
        }
        return data;
    }

    public static void main(String[] args) {
        try { // Create scope in which exceptions can be caught
            int i = new ErrorHandling().foo(42);
        } catch (Exception e) { // Catch the Exception
            System.err.println("Method failed with " + e.getMessage());
        }
    }
}



Catching and Handling Exceptions
Try-Catch Block
The try block contains the code that might throw an exception.
The catch block contains the code to handle the exception.

  THE CODE : 

try {
    // Code that might throw an exception
} catch (Exception e) {
    // Handle the exception
    System.err.println("Method failed with " + e.getMessage());
}



Custom Exceptions
Defining a Custom Exception
You can define custom exceptions by inheriting from the Exception class or one of its subclasses. It's good practice to delegate to each of the superclass's constructors.


  THE CODE :

class BadChar extends Exception {
    public BadChar(String s, char c) {
        super("Bad character '" + c "' in " + s);
    }
    public BadChar() { super(); }
    public BadChar(String message) { super(message); }
    public BadChar(Throwable err) { super(err); }
    public BadChar(String message, Throwable err) { super(message, err);}
}



Using System.out and System.err
System.out: Use for printing normal output.
System.err: Use for printing error messages.
Returning Non-Zero Exit Codes
If your program fails, you can use System.exit(-1) to indicate failure. This is useful for tools like Ant and Make that can behave differently based on the exit code.



  THE CODE :


public static void main(String[] args) {
    try {
        // Code that might throw an exception
    } catch (Exception e) {
        System.err.println("Method failed with " + e.getMessage());
        System.exit(-1); // Return a non-zero exit code
    }
}



Pre-Conditions and Post-Conditions
Using Assert Statements
You can use the assert keyword to check pre-conditions (at the start of a method) and post-conditions (at the end of a method). 
  However, assertions are only enabled if the -ea flag is provided on the command line.


  THE CODE :

  public void method(int errorCode) {
    assert errorCode == 0 : "An error occurred";
    // Method body
}

If the assertion fails, it throws an AssertionError with the specified message.
Key Differences Between Error and Exception
Origin:
Error: Arises due to system abnormalities or resource issues.
Exception: Arises from the application code135.
Recovery:
Error: Usually fatal and non-recoverable.
Exception: Can often be recovered from using try-catch blocks135.
Hierarchy:
Error: Extends the Error class.
Exception: Extends the Exception class125.


  Example Program
Here is a complete example program that demonstrates error handling in Java:


THE CODE :

  public class ErrorHandling {
    public int foo(int data) throws Exception {
        if (data > 10) {
            throw new Exception("bad data"); // Throw an exception
        }
        return data;
    }

    public static void main(String[] args) {
        try { // Create scope in which exceptions can be caught
            int i = new ErrorHandling().foo(42);
            System.out.println("Result: " + i);
        } catch (Exception e) { // Catch the Exception
            System.err.println("Method failed with " + e.getMessage());
            System.exit(-1); // Return a non-zero exit code
        }
    }
}


THE SUMMARY :

  Exceptions vs Error Codes: Exceptions are superior due to their readability, flexibility, and informative error messages.
Throwing Exceptions: Use the throw keyword to throw exceptions.
Catching and Handling Exceptions: Use try-catch blocks to catch and handle exceptions.
Custom Exceptions: Define custom exceptions by inheriting from the Exception class.
System.out and System.err: Use System.out for normal output and System.err for error messages.
Pre-Conditions and Post-Conditions: Use assertions to check conditions, but only if the -ea flag is provided.
