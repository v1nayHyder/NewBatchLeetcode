package New_batch_leetcode;

public class PrimeSubtractOps {
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");

        // Calling the overloaded main methods from the standard main
        main(5);
        main("Hello, Java!");
    }

    // Overloaded main method with an integer parameter
    public static void main(int number) {
        System.out.println("Main method with int parameter: " + number);
    }

    // Overloaded main method with a String parameter
    public static void main(String message) {
        System.out.println("Main method with String parameter: " + message);
    }
}
