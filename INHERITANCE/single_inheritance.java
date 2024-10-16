// In single inheritance, a subclass inherits from a single superclass.
// Example: Animal and Dog

// Superclass (Parent)
class Animal {
    // Field of the superclass
    protected String name;

    // Constructor of the superclass
    public Animal(String name) {
        this.name = name;
    }

    // Method of the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Subclass (Child) extending the superclass
class Dog extends Animal {
    // Constructor of the subclass
    public Dog(String name) {
        super(name); // Calling the superclass constructor
    }

    // New method in the subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

// Main class to test the inheritance
public class Main {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog myDog = new Dog("Rex");

        // Access field of superclass
        System.out.println("My dog's name is " + myDog.name);

        // Call method of superclass
        myDog.eat(); // Output: I can eat

        // Call method of subclass
        myDog.bark(); // Output: I can bark
    }
}

