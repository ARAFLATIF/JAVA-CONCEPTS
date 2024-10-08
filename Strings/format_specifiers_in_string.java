public class StringFormatExample {
    public static void main(String[] args) {
        // Basic variables for demonstration
        String name = "Alice";
        int age = 28;
        double height = 1.65;
        boolean isStudent = true;

        // Using format specifiers with System.out.printf
        System.out.printf("Name: %s, Age: %d, Height: %.2f meters, Student: %b%n", 
                          name, age, height, isStudent);

        // Using String.format to create formatted strings
        String formattedString = String.format("The year is %d and the month is %02d.", 2024, 3);
        System.out.println(formattedString);

        // Demonstrating different format specifiers
        double pi = Math.PI;
        System.out.printf("Pi to 2 decimal places: %.2f%n", pi);
        System.out.printf("Pi in scientific notation: %e%n", pi);

        // Formatting with width and alignment
        System.out.printf("%-10s|%10s%n", "Left", "Right");
        System.out.printf("%-10s|%10s%n", "Aligned", "Aligned");

        // Formatting numbers with thousands separator
        int largeNumber = 1234567;
        System.out.printf("Large number: %,d%n", largeNumber);

        // Formatting dates (requires importing java.util.Date)
        java.util.Date currentDate = new java.util.Date();
        System.out.printf("Current date: %tF%n", currentDate);
        System.out.printf("Current time: %tT%n", currentDate);
    }
}
