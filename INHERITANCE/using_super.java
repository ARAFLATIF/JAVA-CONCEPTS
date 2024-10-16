// The super keyword is used to access the members of the superclass from the subclass.
// Example: Animal and Dog Using super

// Superclass (Parent)
class Animal {
    // Method of the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Subclass (Child) extending the superclass and using super
class Dog extends Animal {
    // Overriding the eat method and using super to call the superclass method
    @Override
    public void eat() {
        super.eat(); // Calling the superclass method
        System.out.println("I eat dog food");
    }

    // New method in the subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

// Main class to test the inheritance and use of super
public class Main {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog myDog = new Dog();

        // Call the overridden method
        myDog.eat(); // Output: I can eat, I eat dog food

        // Call the new method in the subclass
        myDog.bark(); // Output: I can bark
    }
}
