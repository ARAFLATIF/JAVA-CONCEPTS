// Method overriding occurs when a subclass provides a different implementation of a method that is already defined in its superclass.
// Example: Animal and Dog with Method Overriding

// Superclass (Parent)
class Animal {
    // Method of the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Subclass (Child) extending the superclass and overriding the eat method
class Dog extends Animal {
    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }

    // New method in the subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

// Main class to test the inheritance and method overriding
public class Main {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog myDog = new Dog();

        // Call the overridden method
        myDog.eat(); // Output: I eat dog food

        // Call the new method in the subclass
        myDog.bark(); // Output: I can bark
    }
}
