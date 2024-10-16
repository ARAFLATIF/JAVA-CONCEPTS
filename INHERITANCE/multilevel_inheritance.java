// In multilevel inheritance, a subclass inherits from another subclass, which in turn inherits from a superclass.
// Example: Animal, Dog, and Labrador

// Superclass (Grandparent)
class Animal {
    // Method of the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Subclass (Parent) extending the superclass
class Dog extends Animal {
    // New method in the subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

// Sub-subclass (Child) extending the subclass
class Labrador extends Dog {
    // New method in the sub-subclass
    public void display() {
        System.out.println("I am a Labrador");
    }
}

// Main class to test the multilevel inheritance
public class Main {
    public static void main(String[] args) {
        // Create an object of the sub-subclass
        Labrador labrador = new Labrador();

        // Call the method from the superclass
        labrador.eat(); // Output: I can eat

        // Call the method from the subclass
        labrador.bark(); // Output: I can bark

        // Call the method from the sub-subclass
        labrador.display(); // Output: I am a Labrador
    }
}
