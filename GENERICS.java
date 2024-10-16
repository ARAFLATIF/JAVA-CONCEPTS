Generics in Java: A Comprehensive Guide
Generics in Java are a powerful feature that allows you to write algorithms and classes that can work with any data type,
  enhancing code reusability, type safety, and performance. Here’s a detailed explanation of generics, including how to code simple examples.
What are Generics?
Generics enable you to write classes, interfaces, and methods that can operate on different data types. 
  This is achieved by using type parameters, which are placeholders for the actual types that will be specified when the class or method is instantiated or called.


  Key Concepts
Type Parameters
Type parameters are represented by letters such as E, T, U, V, etc., and are placed within angle brackets <> after the class or method name.
Example:

THE CODE :

  class Test<T> {
    T t;
    Test(T t) { this.t = t; }
    public T getField() { return this.t; }
}


Generic Classes
A generic class is a class that is parameterized over types.
Example:

class Test<T> {
    T t;
    Test(T t) { this.t = t; }
    public T getField() { return this.t; }
}
public class TestTest {
    public static void main(String[] args) {
        Test<String> test = new Test<>("I'm generic!");
        System.out.println(test.getField()); // Output: I'm generic!
    }
}


Generic Methods
A generic method is a method that is parameterized over types.
Example:

  THE CODE :

  public class TestTest {
    public static <E> void printIt(E e) {
        System.out.println(e.toString());
    }
    public static void main(String[] args) {
        Test<String> test = new Test<>("I'm generic!");
        printIt(test); // Output: Test@hashcode (toString() of the object)
    }
}



Benefits of Generics
Type Safety
Generics ensure type safety at compile time, preventing errors that could occur at runtime due to incorrect type casting.
Example:

THE CODE :

List<String> strings = new ArrayList<>();
strings.add("Hello");
String s = strings.get(0); // No need for explicit casting


Code Reusability
Generics allow you to write code that can work with different types of data, reducing the need for duplicate code.
Example:

THE CODE :

  public class GFG {
    public static <T> void sortArray(T[] array) {
        // Sorting logic here
    }
    public static void main(String[] args) {
        Integer[] intArray = {100, 22, 58, 41, 6, 50};
        Character[] charArray = {'v', 'g', 'a', 'c', 'x'};
        sortArray(intArray);
        sortArray(charArray);
    }
}


No Type Casting
Generics eliminate the need for explicit type casting when retrieving objects from a collection.
Example:

  THE CODE :

List<String> strings = new ArrayList<>();
strings.add("Hello");
String s = strings.get(0); // No need for explicit casting


Bounded Type Parameters
Bounded type parameters restrict the type parameter to a specific class or interface and its subclasses.
Example: Bounded Type Parameters


  THE CODE :

class GenericsClass<T extends Number> {
    public void display() {
        System.out.println("This is a bounded type generics class.");
    }
}
public class Main {
    public static void main(String[] args) {
        // Valid usage
        GenericsClass<Integer> intObj = new GenericsClass<>();
        GenericsClass<Double> doubleObj = new GenericsClass<>();

        // Invalid usage
        // GenericsClass<String> stringObj = new GenericsClass<>(); // Compiler error
    }
}



Wildcard Type Parameters
Wildcard type parameters use the ? symbol to represent an unknown type.
Upper Bounded Wildcards
? extends Type: Restricts the unknown type to be a subtype of the specified type.
Example:

  THE CODE :

public static void printList(List<? extends Number> list) {
    for (Number n : list) {
        System.out.println(n);
    }
}
public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(1, 2, 3);
    printList(intList); // Valid usage
}



Lower Bounded Wildcards
? super Type: Restricts the unknown type to be a supertype of the specified type.
Example:

THE CODE :

  public static void addList(List<? super Number> list, Number n) {
    list.add(n);
}
public static void main(String[] args) {
    List<Number> numberList = new ArrayList<>();
    addList(numberList, 10); // Valid usage
}



Unbounded Wildcards
?: Represents any type.
Example:


  THE CODE :

public static void printList(List<?> list) {
    for (Object o : list) {
        System.out.println(o);
    }
}
public static void main(String[] args) {
    List<String> stringList = Arrays.asList("a", "b", "c");
    printList(stringList); // Valid usage
}



UML Representation
In UML, generics are represented using a dashed "T" box to the upper right of the class, and instanced via references or informally in the name.
Example: LIFO (Last In First Out) Stack
Here is an example of a generic LIFO stack:


THE CODE :

  import java.util.ArrayList;

class LIFO<E> {
    private ArrayList<E> lifo;

    public LIFO() {
        lifo = new ArrayList<>();
    }

    public void push(E value) {
        lifo.add(value);
    }

    public E pop() {
        return lifo.remove(lifo.size() - 1);
    }

    public static void main(String[] args) {
        LIFO<String> lifo = new LIFO<>(); // Create a LIFO that manages strings
        lifo.push("Hello");
        lifo.push("World");
        System.out.println(lifo.pop()); // Output: World
        System.out.println(lifo.pop()); // Output: Hello
    }
}



Summary
Generic Classes and Methods: Use type parameters to create classes and methods that can work with different data types.
Type Safety: Ensure type safety at compile time to prevent runtime errors.
Code Reusability: Write code that can be reused with different types of data.
Bounded Type Parameters: Restrict type parameters to specific classes or interfaces.
Wildcard Type Parameters: Use ? to represent unknown types with upper and lower bounds.
