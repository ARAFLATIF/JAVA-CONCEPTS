public class BooleanExample {
    public static void main(String[] args) {
        // Declaring boolean variables
        boolean isJavaFun = true;
        boolean isCodingHard = false;

        // Printing boolean values
        System.out.println("Is Java fun? " + isJavaFun);
        // Output: Is Java fun? true
        System.out.println("Is coding hard? " + isCodingHard);
        // Output: Is coding hard? false

        // Boolean AND operator (&&)
        boolean andResult = isJavaFun && isCodingHard;
        System.out.println("isJavaFun && isCodingHard: " + andResult);
        // Output: isJavaFun && isCodingHard: false

        // Boolean OR operator (||)
        boolean orResult = isJavaFun || isCodingHard;
        System.out.println("isJavaFun || isCodingHard: " + orResult);
        // Output: isJavaFun || isCodingHard: true

        // Boolean NOT operator (!)
        boolean notJavaFun = !isJavaFun;
        System.out.println("!isJavaFun: " + notJavaFun);
        // Output: !isJavaFun: false

        // Comparison operations resulting in boolean
        int x = 5;
        int y = 10;
        boolean isXLessThanY = x < y;
        System.out.println("Is " + x + " less than " + y + "? " + isXLessThanY);
        // Output: Is 5 less than 10? true

        // Using boolean in if statements
        if (isJavaFun) {
            System.out.println("Let's code in Java!");
        } else {
            System.out.println("Let's try another language.");
        }
        // Output: Let's code in Java!

        // Ternary operator with boolean
        String result = isCodingHard ? "Keep practicing!" : "You're doing great!";
        System.out.println(result);
        // Output: You're doing great!

        // Complex boolean expression
        boolean complexCondition = (isJavaFun && !isCodingHard) || (x < y);
        System.out.println("Complex condition result: " + complexCondition);
        // Output: Complex condition result: true
    }
}
