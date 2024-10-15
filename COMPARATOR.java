// The Comparator interface in Java is a powerful tool for ordering objects of a user-defined class. Here’s a detailed overview of how it works and how to use it:
// What is the Comparator Interface?
// The Comparator interface is part of the java.util package and is used to order the objects of a user-defined class. 
//   It is not to be confused with the Comparable interface, which is implemented by the class itself to define its natural ordering234.
// Methods of the Comparator Interface
// The Comparator interface contains two main methods:
// compare(Object obj1, Object obj2)
// This method compares two objects and returns an integer value indicating their order.
// Negative Value: If obj1 is less than obj2, the method returns a negative integer.
// Zero: If obj1 is equal to obj2, the method returns zero.
// Positive Value: If obj1 is greater than obj2, the method returns a positive integer.
// equals(Object obj)
// This method is used to check if the comparator is consistent with the equals method. However, it is not commonly used and can be overridden if necessary.
// Implementing the Comparator Interface
// To use the Comparator interface, you need to create a class that implements it and override the compare method.
// Example: Sorting Students by Age and Name
// Here is an example of how to implement a Comparator to sort a list of Student objects based on age and name:


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (a.getAge() != b.getAge()) {
            return a.getAge() - b.getAge();
        } else {
            return a.getName().compareTo(b.getName());
        }
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 25));
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 25));

        System.out.println("Before Sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new AgeComparator());
        System.out.println("After Sorting by Age:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new NameComparator());
        System.out.println("After Sorting by Name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


// Using Lambda Expressions and Method References
// In Java 8 and later, you can use lambda expressions or method references to implement the Comparator interface more concisely.
// Example: Using Lambda Expression


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 25));
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 25));

        System.out.println("Before Sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting by age using lambda expression
        Collections.sort(students, (a, b) -> a.getAge() - b.getAge());
        System.out.println("After Sorting by Age:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting by name using method reference
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("After Sorting by Name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}



// NullsFirst and NullsLast Methods
// Java 8 introduced the nullsFirst and nullsLast methods in the Comparator interface to handle null elements.
// Example: Using nullsFirst and nullsLast

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 25));
        students.add(null);
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 25));

        // Sorting with nullsFirst
        Collections.sort(students, Comparator.nullsFirst(Comparator.comparing(Student::getName)));
        System.out.println("After Sorting with nullsFirst:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting with nullsLast
        Collections.sort(students, Comparator.nullsLast(Comparator.comparing(Student::getName)));
        System.out.println("After Sorting with nullsLast:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}



// Conclusion
// The Comparator interface provides a flexible way to sort objects based on different criteria.
//   It is particularly useful when you need to sort objects in multiple ways or when the objects do not have a natural ordering defined by the Comparable interface. 
//   By implementing the compare method, you can define custom sorting logic that suits your needs. 
//   Additionally, using lambda expressions and method references can make your code more concise and readable.
