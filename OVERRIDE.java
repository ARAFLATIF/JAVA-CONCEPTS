Method Overriding in Simple Terms
Method overriding is a concept in object-oriented programming (OOP) that allows a subclass (child class) to provide its own implementation of a method that is already defined in its superclass (parent class).
Key Points:
Same Method Name and Parameters:
The method in the subclass must have the same name, return type, and parameter list as the method in the superclass256.
Different Implementation:
The subclass provides its own specific implementation of the method, which can be different from the one in the superclass.
Runtime Polymorphism:
Method overriding helps achieve runtime polymorphism, where the method to be executed is determined at runtime based on the type of the object being referred to256.

  Example:

Here is a simple example to illustrate method overriding:
Superclass: Animal

  code :

  class Animal {
    public void eat() {
        System.out.println("Animals can eat");
    }
}

Subclass: Dog

  code :

  class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dogs eat dog food");
    }

    public void bark() {
        System.out.println("Dogs can bark");
    }
}

Main Class

  code :

public class Main {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog myDog = new Dog();

        // Call the overridden method
        myDog.eat(); // Output: Dogs eat dog food

        // Call the new method in the subclass
        myDog.bark(); // Output: Dogs can bark

        // Using polymorphism
        Animal animal = new Dog();
        animal.eat(); // Output: Dogs eat dog food
    }
}


Explanation :
Overridden Method:
The eat method in the Dog class overrides the eat method in the Animal class. This means when you call eat on a Dog object, it will execute the eat method defined in the Dog class.
Polymorphism:
When you use a reference of the superclass type (Animal) to refer to an object of the subclass type (Dog), calling the eat method will still execute the overridden method in the Dog class. This is an example of runtime polymorphism.
Rules and Best Practices
Access Modifiers:
The access modifier of the overridden method can be more permissive but not less permissive than the access modifier of the method in the superclass15.
Exception Handling:
The overridden method can throw any unchecked exceptions, but it cannot throw new or broader checked exceptions than those declared by the overridden method15.
super Keyword:
You can use the super keyword to call the method of the superclass from the method of the subclass6.
  
