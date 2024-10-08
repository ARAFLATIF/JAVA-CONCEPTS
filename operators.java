public class ArithmeticAndComparisonOperatorsExample {
    public static void main(String[] args) {
        // Declaring variables
        int a = 10;
        int b = 5;
        int c = 10;
        
        System.out.println("Arithmetic Operators:");
        // Addition
        int sum = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + sum);
        // Output: Addition: 10 + 5 = 15
        
        // Subtraction
        int difference = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);
        // Output: Subtraction: 10 - 5 = 5
        
        // Multiplication
        int product = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + product);
        // Output: Multiplication: 10 * 5 = 50
        
        // Division
        int quotient = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + quotient);
        // Output: Division: 10 / 5 = 2
        
        // Modulus (remainder)
        int remainder = a % b;
        System.out.println("Modulus: " + a + " % " + b + " = " + remainder);
        // Output: Modulus: 10 % 5 = 0
        
        // Increment
        int d = a++;
        System.out.println("Postfix increment: d = a++ results in d = " + d + " and a = " + a);
        // Output: Postfix increment: d = a++ results in d = 10 and a = 11
        
        // Reset a
        a = 10;
        d = ++a;
        System.out.println("Prefix increment: d = ++a results in d = " + d + " and a = " + a);
        // Output: Prefix increment: d = ++a results in d = 11 and a = 11
        
        // Decrement
        a = 10;
        d = a--;
        System.out.println("Postfix decrement: d = a-- results in d = " + d + " and a = " + a);
        // Output: Postfix decrement: d = a-- results in d = 10 and a = 9
        
        // Reset a
        a = 10;
        d = --a;
        System.out.println("Prefix decrement: d = --a results in d = " + d + " and a = " + a);
        // Output: Prefix decrement: d = --a results in d = 9 and a = 9

        System.out.println("\nComparison Operators:");
        // Greater than
        boolean isGreater = a > b;
        System.out.println(a + " > " + b + " is " + isGreater);
        // Output: 9 > 5 is true

        // Less than
        boolean isLess = a < b;
        System.out.println(a + " < " + b + " is " + isLess);
        // Output: 9 < 5 is false

        // Greater than or equal to
        boolean isGreaterOrEqual = a >= c;
        System.out.println(a + " >= " + c + " is " + isGreaterOrEqual);
        // Output: 9 >= 10 is false

        // Less than or equal to
        boolean isLessOrEqual = a <= c;
        System.out.println(a + " <= " + c + " is " + isLessOrEqual);
        // Output: 9 <= 10 is true

        // Equal to
        boolean isEqual = a == c;
        System.out.println(a + " == " + c + " is " + isEqual);
        // Output: 9 == 10 is false

        // Not equal to
        boolean isNotEqual = a != c;
        System.out.println(a + " != " + c + " is " + isNotEqual);
        // Output: 9 != 10 is true
    }
}
