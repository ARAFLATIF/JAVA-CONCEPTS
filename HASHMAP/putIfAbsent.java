// Example: Using putIfAbsent in HashMap

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> map = new HashMap<>();

        // Add some initial key-value pairs
        map.put("USA", "Washington");
        map.put("Canada", "Ottawa");

        // Use putIfAbsent to add a new key-value pair if the key is not present
        String value = map.putIfAbsent("Mexico", "Mexico City");
        System.out.println("Value for Mexico: " + value); // Output: null
        System.out.println("Updated Map: " + map); // Output: {USA=Washington, Canada=Ottawa, Mexico=Mexico City}

        // Use putIfAbsent to add a key-value pair where the key is already present
        value = map.putIfAbsent("USA", "New York");
        System.out.println("Value for USA: " + value); // Output: Washington
        System.out.println("Updated Map: " + map); // Output: {USA=Washington, Canada=Ottawa, Mexico=Mexico City}
    }
}

// Key Points
// Adding New Entries: If the key is not present, putIfAbsent adds the key-value pair and returns null.
// Existing Entries: If the key is already present, putIfAbsent does not add a new entry and returns the existing value.
// This example demonstrates how to use putIfAbsent to ensure that only new keys are added to the map without overwriting existing entries.
