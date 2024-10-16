// What are Wrapper Classes in Java?
// Wrapper classes in Java are used to convert primitive data types into objects, allowing these primitives to be used in contexts where objects are required.
// Key Points
// Primitive Types and Corresponding Wrapper Classes
// Here are the primitive types and their corresponding wrapper classes:
// Primitive Type	Wrapper Class
// byte	Byte
// short	Short
// int	Integer
// long	Long
// float	Float
// double	Double
// char	Character
// boolean	Boolean
// Need for Wrapper Classes
// Collections: Wrapper classes are necessary when working with collections like ArrayList, HashSet, etc., because these collections can only store objects, not primitive types145.
// Null Values: Wrapper classes allow you to store null values, which is not possible with primitive types24.
// Methods and Operations: Wrapper classes provide various methods to manipulate and convert the wrapped primitive values125

// Autoboxing and Unboxing
// Autoboxing: The automatic conversion of a primitive type to its corresponding wrapper class. For example, int to Integer246
// .
// java

int a = 5;
Integer aObj = a; // Autoboxing

// Unboxing: The reverse process of autoboxing, converting a wrapper class to its corresponding primitive type. For example, Integer to int246
// .
// java 

Integer aObj = 5;
int a = aObj; // Unboxing

// Common Methods
// valueOf(): Converts a primitive type or a string to its corresponding wrapper object.
// java

Integer aObj = Integer.valueOf(5);

// intValue(), doubleValue(), etc.: Converts the wrapper object back to its primitive type.
// java

int a = aObj.intValue();

// toString(): Converts the wrapper object to a string.
// java

String str = aObj.toString();


// Example Usage
// Here is a simple example demonstrating the use of wrapper classes:

public class Main {
    public static void main(String[] args) {
        // Create wrapper objects
        Integer myInt = 10;
        Double myDouble = 5.99;
        Character myChar = 'A';

        // Print the values
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // Convert wrapper objects to primitive types
        int primitiveInt = myInt.intValue();
        double primitiveDouble = myDouble.doubleValue();
        char primitiveChar = myChar.charValue();

        System.out.println(primitiveInt);
        System.out.println(primitiveDouble);
        System.out.println(primitiveChar);
    }
}

// Conclusion
// Wrapper classes are essential in Java for converting between primitive types and objects, enabling the use of primitives in object-oriented contexts.
//   They provide various methods for manipulation and conversion, and they are crucial when working with collections and other scenarios where objects are required.
