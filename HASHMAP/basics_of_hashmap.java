// What is a HashMap in Java?
// A HashMap in Java is a part of the Java Collections Framework and is used to store data in key-value pairs. Here’s a detailed overview of how it works and its key features:
// Key Components of HashMap
// Hashing
// Hash Code: The process of converting an object into an integer value, known as the hash code, is crucial for indexing and faster searches. 
//   The hashCode() method of the Object class returns the memory reference of an object in integer form, but you can override this method to provide a custom implementation3.
// Internal Data Structure
// Array and LinkedList: Internally, HashMap uses an array of nodes, where each node represents a key-value pair. 
//   In case of hash collisions (when two keys have the same hash code), HashMap uses a LinkedList to store multiple entries at the same index13.
// Methods and Operations
// Inserting Key-Value Pairs
// put(K key, V value): This method is used to insert or update a key-value pair in the HashMap. Here’s how it works:
// Calculate the hash code of the key using the hashCode() method.
// Use the hash code to calculate the index in the array where the key-value pair should be stored.
// If there is no collision, the key-value pair is stored at the calculated index.
// If there is a collision, the new key-value pair is added to the LinkedList at that index13.


// Example of Insertion :

Map<String, Integer> map = new HashMap<>();
map.put("Aman", 19); // Calculate hash code for "Aman" and store at the calculated index.
map.put("Sunny", 29); // If "Sunny" has the same hash code as "Aman", it will be added to the LinkedList.


// Retrieving Values
// get(K key): This method is used to retrieve the value associated with a given key.
// Calculate the hash code of the key.
// Use the hash code to find the index in the array.
// Traverse the LinkedList at that index to find the key and return its associated value13.


// Example of Retrieval :

String value = map.get("Aman"); // Calculate hash code for "Aman" and retrieve the associated value.


// Handling Hash Collisions
// Hash Collision: When two keys have the same hash code, it is known as a hash collision. 
//   In such cases, HashMap uses a LinkedList to store multiple entries at the same index.
// The equals() method is used to compare keys in the LinkedList to ensure that the correct key-value pair is accessed or updated13.
// Null Keys and Values
// Null Keys: HashMap allows one null key.
// The hash code of a null key is always 0, so it will be stored at index 03.
// Null Values: HashMap allows multiple null values.
// Null values can be stored for any key2.
// Example Usage

// Here is a simple example of using a HashMap:

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 22);
        map.put("Bob", 25);

        System.out.println("Value for John: " + map.get("John"));
        System.out.println("Value for Alice: " + map.get("Alice"));
        System.out.println("Value for Bob: " + map.get("Bob"));

        // Update a value
        map.put("John", 26);
        System.out.println("Updated Value for John: " + map.get("John"));

        // Remove a key-value pair
        map.remove("Alice");
        System.out.println("Is Alice present? " + map.containsKey("Alice"));
    }
}


// Key Methods
// put(K key, V value): Inserts or updates a key-value pair.
// get(K key): Retrieves the value associated with the given key.
// remove(K key): Removes the key-value pair associated with the given key.
// containsKey(K key): Checks if the map contains the specified key.
// keySet(): Returns a set view of the keys contained in this map.
// values(): Returns a collection view of the values contained in this map.
// entrySet(): Returns a set view of the mappings contained in this map2.
// Performance and Best Practices
// Hash Code Distribution: For efficient performance, it is crucial that the hash codes are evenly distributed to minimize collisions.
// Custom hashCode and equals Methods: Ensure that the hashCode() and 
//   equals() methods are properly overridden for custom key classes to avoid unexpected behavior13.
