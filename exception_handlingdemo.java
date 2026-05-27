//WAP to demonstrate exception handling in Java with simple example.
public class exception_handlingdemo {   
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        
        try {
            // This will throw an ArithmeticException
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}