public class throw_excep {
    //WAP to demonstrate throwing an exception in Java with simple example.
    public static void main(String[] args) {
        int a = 10;
        int b = 2;        
        try {
            if (b == 2) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
    
}
