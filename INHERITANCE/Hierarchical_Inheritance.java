// In hierarchical inheritance, multiple subclasses inherit from a single superclass.
// Example: Animal, Dog, and Cat

// Superclass (Parent)
class Animal {
    // Method of the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Subclass (Child) extending the superclass
class Dog extends Animal {
    // New method in the subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

// Another subclass (Child) extending the superclass
class Cat extends Animal {
    // New method in the other subclass
    public void meow() {
        System.out.println("I can meow");
    }
}

// Main class to test the hierarchical inheritance
public class Main {
    public static void main(String[] args) {
        // Create objects of the subclasses
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Call methods on the dog object
        dog.eat(); // Output: I can eat
        dog.bark(); // Output: I can bark

        // Call methods on the cat object
        cat.eat(); // Output: I can eat
        cat.meow(); // Output: I can meow
    }
}
