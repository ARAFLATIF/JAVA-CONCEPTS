What is Polymorphism?
Polymorphism is a fundamental concept in object-oriented programming (OOP) that allows objects of different classes to be treated as objects
  of a common superclass. Here’s a detailed explanation of polymorphism, its types, and how it is used:

Definition
Polymorphism is the ability of an object or a method to take on multiple forms, depending on the context in which it is used. 
  This concept is crucial for making programs more modular, flexible, and extensible. 

  Real-Life Analogy
A simple real-life analogy for polymorphism is a button. Everyone knows how to use a button by pressing it, but what the button does depends on its context. 
  For example, a button in a car might turn on the radio, while a button on a remote control might change the TV channel. The user interacts with the button in the same way 
  (pressing it), but the outcome varies based on the context12.
  
Benefits
Modularity and Extensibility: Polymorphism allows for more modular and extensible code. You can add new classes or methods without changing the existing code, 
  making it easier to maintain and extend the program.
Flexibility: It enables treating different objects uniformly, which simplifies the code and makes it more flexible.
Reusability: Polymorphic code can be reused in various contexts, reducing the need for duplicate code.


  Here is a comprehensive example in Java that demonstrates method overriding and subtyping polymorphism :

  // Superclass
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclass
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Subclass
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Rectangle()};

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}


EXPLANATION : 

In this example, the Shape class is the superclass, and Circle and Rectangle are subclasses that override the draw method. 
  The Main class demonstrates subtyping polymorphism by treating objects of different classes uniformly through a common superclass reference.
