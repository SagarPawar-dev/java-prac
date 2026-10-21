public class exp6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println("Inside try block");
            int result = a / b; // Throws ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Division by zero is not allowed!");
        } finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program continues normally...");
    }
}
