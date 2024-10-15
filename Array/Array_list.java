// Basic Initialization
// You can initialize an ArrayList using the default constructor and then add elements using the add method.

import java.util.ArrayList;

public class SimpleInitialization {
    public static void main(String[] args) {
        // Create an empty ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        // Print the ArrayList
        System.out.println(names);
    }
}

//OUTPUT:
// [John, Alice, Bob]

// Constructors
// There are several constructors available to create an ArrayList:
// Default Constructor: Creates an empty list with an initial capacity of 10.
java
ArrayList() // Constructs an empty list with an initial capacity of ten.

Constructor with Initial Capacity: Creates an empty list with the specified initial capacity.
java
ArrayList(int initialCapacity) // Constructs an empty list with the specified initial capacity.

// Constructor with Collection: Creates a list containing the elements of the specified collection.
java
ArrayList(Collection<? extends E> c) // Constructs a list containing the elements of the specified collection.
```[3][4][6].


  Key Methods
Adding Elements
add(E e): Appends the specified element to the end of this list.
java
boolean add(E e)

add(int index, E element): Inserts the specified element at the specified position in this list.
java
void add(int index, E element)

addAll(Collection<? extends E> c): Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
java
boolean addAll(Collection<? extends E> c)
```[1][3][6].

Accessing Elements
get(int index): Returns the element at the specified position in this list.
java
E get(int index)

indexOf(Object o): Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
java
int indexOf(Object o)
```[1][3][6].

Modifying Elements
set(int index, E element): Replaces the element at the specified position in this list with the specified element.
java
E set(int index, E element)
```[1][3][6].

Removing Elements
remove(Object o): Removes the first occurrence of the specified element from this list, if it is present.
java
boolean remove(Object o)

remove(int index): Removes the element at the specified position in this list.
java
E remove(int index)
```[1][3][6].

Clearing the List
clear(): Removes all of the elements from this list.
java
void clear()
```[1][3][6].



// Example Usage
// Here is an example of how to create and use an ArrayList:

  import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> cars = new ArrayList<>();

        // Add elements
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Print the list
        System.out.println(cars);

        // Access an element
        System.out.println("First car: " + cars.get(0));

        // Modify an element
        cars.set(0, "Toyota");
        System.out.println("List after modification: " + cars);

        // Remove an element
        cars.remove(0);
        System.out.println("List after removal: " + cars);

        // Check if the list is empty
        System.out.println("Is list empty? " + cars.isEmpty());

        // Clear the list
        cars.clear();
        System.out.println("List after clearing: " + cars);
    }
}


// Key Points
// Dynamic Size: Unlike standard Java arrays, ArrayList can grow or shrink dynamically as elements are added or removed126.
// Null Elements: ArrayList allows null elements136.
// Performance: The constant factor is low compared to LinkedList, making it efficient for many operations136.
// Synchronization: ArrayList is not synchronized; use Collections.synchronizedList if synchronization is needed34.

Checking List Status
isEmpty(): Returns true if this list contains no elements.
java
boolean isEmpty()

size(): Returns the number of elements in this list.
java
int size()
```[1][3][6].
