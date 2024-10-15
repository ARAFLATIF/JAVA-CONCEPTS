// Example: Comparing Two Integer Arrays

import java.util.Arrays;

public class CompareArraysExample {
    public static void main(String[] args) {
        // Declare and initialize two integer arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};

        // Print the arrays
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));

        // Compare array1 and array2
        boolean areEqual12 = Arrays.equals(array1, array2);
        System.out.println("Are array1 and array2 equal? " + areEqual12);

        // Compare array1 and array3
        boolean areEqual13 = Arrays.equals(array1, array3);
        System.out.println("Are array1 and array3 equal? " + areEqual13);
    }
}

//OUTPUT : Array 1: [1, 2, 3, 4, 5]
// Array 2: [1, 2, 3, 4, 5]
// Array 3: [1, 2, 3, 4, 6]
// Are array1 and array2 equal? true
// Are array1 and array3 equal? false


// Explanation
// Array Initialization: Two integer arrays array1 and array2 are initialized with the same elements, and array3 is initialized with slightly different elements.
// Arrays.equals() Method: The Arrays.equals() method is used to compare array1 with array2 and array1 with array3.
// For array1 and array2, since they contain the same elements in the same order, the method returns true.
// For array1 and array3, since they do not contain the same elements in the same order, the method returns false.


// Comparing Arrays of Objects
// Here is an example of comparing arrays of objects using Arrays.equals

import java.util.Arrays;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}

public class CompareArraysObjectsExample {
    public static void main(String[] args) {
        // Declare and initialize two arrays of Person objects
        Person[] people1 = {new Person("Alice", 25), new Person("Bob", 30)};
        Person[] people2 = {new Person("Alice", 25), new Person("Bob", 30)};
        Person[] people3 = {new Person("Alice", 25), new Person("Bob", 31)};

        // Print the arrays
        System.out.println("People 1: " + Arrays.toString(people1));
        System.out.println("People 2: " + Arrays.toString(people2));
        System.out.println("People 3: " + Arrays.toString(people3));

        // Compare people1 and people2
        boolean areEqual12 = Arrays.equals(people1, people2);
        System.out.println("Are people1 and people2 equal? " + areEqual12);

        // Compare people1 and people3
        boolean areEqual13 = Arrays.equals(people1, people3);
        System.out.println("Are people1 and people3 equal? " + areEqual13);
    }
}

//OUTPUT : People 1: [Person{name='Alice', age=25}, Person{name='Bob', age=30}]
// People 2: [Person{name='Alice', age=25}, Person{name='Bob', age=30}]
// People 3: [Person{name='Alice', age=25}, Person{name='Bob', age=31}]
// Are people1 and people2 equal? true
// Are people1 and people3 equal? false

// In this example, the equals method is overridden in the Person class to define how two Person objects are considered equal. 
//   The Arrays.equals() method then uses this overridden equals method to compare the elements of the arrays.
