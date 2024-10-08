public class Main {
    public static void main(String[] args) {
        // Example 1: String declaration and initialization
        String Name = "Araf Ibne Latif";
        System.out.println(Name);
        // This creates a String variable 'Name' and assigns it a value
        // The value is then printed to the console

        // Example 2: String literals
        String literalString1 = "abc";
        String literalString2 = "abc";
        // These create two String variables using string literals
        // Both variables refer to the same object in the String pool
        // Java optimizes memory by reusing identical string literals

        // Example 3: String objects
        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");
        // These create two separate String objects using the 'new' keyword
        // Even though the content is the same, they are distinct objects in memory

        // Comparing string literals
        System.out.println(literalString1 == literalString2);
        // This compares the references of literalString1 and literalString2
        // It will print 'true' because both variables refer to the same object in the String pool

        // Comparing String objects
        System.out.println(objectString1 == objectString2);
        // This compares the references of objectString1 and objectString2
        // It will print 'false' because they are separate objects in memory, despite having the same content

        // Note: When comparing String content, use .equals() method instead of ==
        System.out.println(objectString1.equals(objectString2)); // This will print 'true'
    }
}
