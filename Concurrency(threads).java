Concurrency and Threads in Java: A Simple Explanation
Concurrency in Java involves running multiple threads of execution within a single program, each thread sharing the same memory space but executing independently.
  Here’s a straightforward explanation of how to work with threads in Java, including creating, joining, and managing them.
What are Threads?
Threads are lightweight processes that run concurrently within a single program.
Each thread has its own flow of execution but shares the same memory space as other threads in the program.
Creating Threads
There are two common ways to create threads in Java:
Using the Runnable Interface
You can implement the Runnable interface to define the code that will be executed by the thread.

  

  THE CODE :

  

  class Bobbin implements Runnable {
    String msg;
    public Bobbin(String msg) { this.msg = msg; }
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; --i) {
                System.out.print(i + "... ");
                Thread.sleep(1000); // pause 1 second
            }
            System.out.println("Bobbin says: " + msg);
        } catch (InterruptedException e) { // sleep() may throw InterruptedException
            System.out.println("Thread was interrupted.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bobbin bobbin = new Bobbin("Godspeed on the final!");
        Thread t1 = new Thread(bobbin); // runs bobbin.run() as a thread
        t1.start();
    }
}


Using Lambda Expressions
You can use lambda expressions to create threads in a more concise way.
  

  THE CODE : 

public class Main {
    public static void main(String[] args) {
        Thread t2 = new Thread(() -> System.out.println("I'm a lambda!"));
        t2.start();
    }
}



Starting Threads
To start a thread, you call the start() method on the Thread object.

  THE CODE :

  Thread t1 = new Thread(bobbin);
t1.start();



Joining Threads
The join() method is used to wait for a thread to complete its execution before proceeding with the rest of the program.


  THE CODE :


try {
    t1.join(); // Wait for t1 to finish
    t2.join(); // Wait for t2 to finish
} catch (InterruptedException e) {
    System.out.println("Thread was interrupted while joining.");
}


Getting Thread ID
You can get the ID of a thread using the getId() method

  THE CODE :

  long threadId = t1.getId();
System.out.println("Thread ID: " + threadId);



Sleeping Threads
The sleep() method is used to pause the execution of a thread for a specified amount of time.


  THW CODE :

  try {
    Thread.sleep(1000); // pause 1 second
} catch (InterruptedException e) {
    System.out.println("Thread was interrupted while sleeping.");
}


Thread Pool
A thread pool is a group of worker threads that can be used to execute multiple tasks concurrently. Here’s an example of creating an array of threads:


THW CODE :

  Thread[] threads = new Thread[5];
for (int i = 0; i < 5; i++) {
    threads[i] = new Thread(new Bobbin("Task " + i));
    threads[i].start();
}
for (Thread thread : threads) {
    try {
        thread.join();
    } catch (InterruptedException e) {
        System.out.println("Thread was interrupted while joining.");
    }
}



Unpredictable Execution Order
The order in which threads execute is unpredictable and depends on the scheduler. Here’s an example that demonstrates this:


THE CODE :

  public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("I'm thread 1!"));
        Thread t2 = new Thread(() -> System.out.println("I'm thread 2!"));
        t1.start();
        t2.start();
    }
}

}

In this example, you cannot predict which thread will print its message first because the execution order is determined by the thread scheduler.



  UML Representation
Here is a simple UML class diagram for the Bobbin class:

  +------------------+
|       Bobbin      |
+------------------+
| - msg: String     |
+------------------+
| + Bobbin(msg: String) |
| + run(): void      |
+------------------+



  Summary
Creating Threads: Use the Runnable interface or lambda expressions to define the code for a thread.
Starting Threads: Call the start() method to begin the execution of a thread.
Joining Threads: Use the join() method to wait for a thread to complete its execution.
Getting Thread ID: Use the getId() method to get the ID of a thread.
Sleeping Threads: Use the sleep() method to pause the execution of a thread.
Thread Pool: Create an array of threads to manage multiple tasks concurrently.
Unpredictable Execution Order: The order in which threads execute is determined by the thread scheduler and is unpredictable.
