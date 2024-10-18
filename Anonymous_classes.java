Anonymous Classes in Java: A Detailed Explanation
Anonymous classes in Java are a powerful feature that allows you to declare and instantiate a class simultaneously, 
  often to implement an interface or extend a class in a concise manner. Here’s a detailed explanation of anonymous classes, including their syntax, use cases, and examples.
What is an Anonymous Class?
An anonymous class is an inner class that does not have a name. 
  It is defined inside another class and is used to creat e objects that implement interfaces or extend classes without declaring a separate named class.


  Syntax of Anonymous Classes
The syntax for an anonymous class involves defining the class body directly where the object is created. Here is a general template:

THE CODE :

  Type objectName = new Type() {
    // Class body
};

Type: This can be a superclass that the anonymous class extends or an interface that the anonymous class implements.
Class Body: This is where you define the methods and fields of the anonymous class.


Example: Anonymous Class Implementing an Interface
Here is an example of an anonymous class implementing the Runnable interface:


THE CODE :

public class MenuItem {
    public MenuItem(String menuText, Runnable menuResponse) { /*... */ }

    public static void main(String[] args) {
        MenuItem mi = new MenuItem("Pick me!",
            new Runnable() { // Anonymous class implements Runnable
                @Override
                public void run() {
                    System.out.println("You picked me!");
                }
            }
        );
    }
}


In this example, the Runnable interface is implemented by an anonymous class that overrides the run() method.


  Example: Anonymous Class Extending a Class
Here is an example of an anonymous class extending a class:


THE CODE :

  class Polygon {
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}

public class AnonymousDemo {
    public void createClass() {
        // Creation of anonymous class extending class Polygon
        Polygon p1 = new Polygon() {
            @Override
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }

    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}

In this example, the Polygon class is extended by an anonymous class that overrides the display() method.




  Use Cases for Anonymous Classes
Implementing Interfaces
Anonymous classes are often used to implement interfaces in-place, especially when you need to provide a simple implementation for a one-time use.


  THE CODE :


interface Software {
    public void develop();
}

public class Tester {
    public static void main(String[] args) {
        Software s = new Software() {
            @Override
            public void develop() {
                System.out.println("Software Developed in Java");
            }
        };
        s.develop();
    }
}



Extending Classes
Anonymous classes can also extend classes and override their methods.


  THE CODE :

class Car {
    public void engineType() {
        System.out.println("Turbo Engine");
    }
}

public class Tester {
    public static void main(String[] args) {
        Car c2 = new Car() {
            @Override
            public void engineType() {
                System.out.println("V2 Engine");
            }
        };
        c2.engineType();
    }
}


As Method Arguments
Anonymous classes can be used as arguments to methods.


  THE CODE :

abstract class Engine {
    public abstract void engineType();
}

class Vehicle {
    public void transport(Engine e) {
        e.engineType();
    }
}

public class Tester {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.transport(new Engine() {
            @Override
            public void engineType() {
                System.out.println("Turbo Engine");
            }
        });
    }
}


Advantages of Anonymous Classes
Conciseness: Anonymous classes make your code more concise by allowing you to define and instantiate a class in one step235.
One-Time Use: They are useful when you need to create an object that implements an interface or extends a class for a specific, one-time use35.
Restrictions of Anonymous Classes
No Constructors: Since anonymous classes do not have a name, they cannot have constructors3.
Single Interface or Class: An anonymous class can either extend a class or implement an interface, but not both at the same time3.
Access to Enclosing Scope: Anonymous classes have access to the members of their enclosing class, but they cannot access local variables unless those variables are final or effectively final3.



  UML Representation
In UML, anonymous classes are not explicitly represented by name but can be indicated by their role in the class diagram. Here is a simple representation:



+------------------+
|       MenuItem    |
+------------------+
| - menuText: String|
| - menuResponse:   |
|   Runnable        |
+------------------+
| + MenuItem(menuText: String,  |
|   menuResponse: Runnable)     |
+------------------+


  In this example, the Runnable interface is implemented by an anonymous class, but it is not named in the UML diagram.


  Summary
Definition: An anonymous class is an inner class without a name, defined inside another class.
Syntax: Type objectName = new Type() { // Class body };
Use Cases: Implementing interfaces, extending classes, and as method arguments.
Advantages: Conciseness and suitability for one-time use.
Restrictions: No constructors, can only extend one class or implement one interface, and limited access to local variables.
