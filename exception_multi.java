public class exception_multi {
//WAP to demonstrate multiple exception handling in Java with simple example.
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        String str = null;
        
        try {
            // This will throw an ArithmeticException
            int result = a / b;
            System.out.println("Result: " + result);
            
            // This will throw a NullPointerException
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: String is null. " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
    
}
