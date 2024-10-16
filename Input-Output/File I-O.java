Using BufferedWriter for Efficient File Writing
Why Use BufferedWriter?
BufferedWriter is more efficient than FileWriter because it buffers the characters before writing them to the file. 
  This reduces the number of I/O operations, making it faster for multiple small writes237.

  Example: Writing to a File Using BufferedWriter
Here is an example of how to write to a file using BufferedWriter:

THE CODE : 

  import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String data = "This is the content to write into the file.";
        String fileName = "output.txt";

        try (FileWriter file = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(file)) {
            bufferedWriter.write(data);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


Key Points
Creating BufferedWriter:
First, create a FileWriter object with the file name.
Then, wrap the FileWriter object with a BufferedWriter object135.
Writing Data:
Use the write method of BufferedWriter to write data to the file.
The data is buffered before being written to the file, improving performance23.
Closing Resources:
Use a try-with-resources statement to ensure that the BufferedWriter and FileWriter are closed properly, even if an exception occurs


  Difference Between FileWriter and BufferedWriter
FileWriter
FileWriter writes directly to the file without buffering.
Each call to write results in a system call, which can be inefficient for multiple small writes25.
BufferedWriter
BufferedWriter buffers the characters before writing them to the file.
This reduces the number of system calls, making it more efficient for multiple small writes


  Example: Comparing FileWriter and BufferedWriter
Here is an example that compares the usage of FileWriter and BufferedWriter:

THE CODE :

  import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterVsBufferedWriter {
    public static void main(String[] args) {
        String data = "This is the content to write into the file.";
        String fileNameFW = "filewriter.txt";
        String fileNameBW = "bufferedwriter.txt";

        // Using FileWriter
        try (FileWriter fileWriter = new FileWriter(fileNameFW)) {
            fileWriter.write(data);
            System.out.println("File written using FileWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using BufferedWriter
        try (FileWriter file = new FileWriter(fileNameBW);
             BufferedWriter bufferedWriter = new BufferedWriter(file)) {
            bufferedWriter.write(data);
            System.out.println("File written using BufferedWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


Using try-with-resources for Automatic Resource Management
The try-with-resources statement is used to automatically close resources that implement the AutoCloseable interface, such as BufferedWriter and FileWriter. 
  This ensures that resources are properly closed even if an exception occurs

  Example: Using try-with-resources
Here is an example that demonstrates the use of try-with-resources:

THE CODE : 

  import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        String data = "This is the content to write into the file.";
        String fileName = "output.txt";

        try (FileWriter file = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(file)) {
            bufferedWriter.write(data);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



Reading and Writing Files with Other Classes
Using BufferedReader and FileReader
For reading files, you can use BufferedReader and FileReader in a similar manner to how BufferedWriter and FileWriter are used for writing files.

  THE CODE : 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        String fileName = "input.txt";

        try (FileReader file = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(file)) {
            String line;
            while ((line = bufferedReader.readLine())!= null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


Using Scanner for Reading Files
You can also use the Scanner class to read files, especially when you need to parse different types of data.

  THE CODE :

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        String fileName = "input.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

THE SUMMARY : 

  Efficiency: Use BufferedWriter for efficient writing to files, especially when performing multiple small writes.
Resource Management: Use try-with-resources to ensure that resources are properly closed.
Reading Files: Use BufferedReader and FileReader or Scanner for reading files.
