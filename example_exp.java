public class example_exp {
//Create a program to handle a divide-by-zero exception and print a custom message like "Cannot divide by zero”.
//Write a program that throws a NullPointerException when trying to access an object that is not initialized.
//Create a program that catches and handles an ArrayIndexOutOfBoundsException when accessing an array element outside its bounds.
    public static void main(String[] args) {
        // Example of handling divide-by-zero exception
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. " + e.getMessage());
        }
        // Example of throwing NullPointerException
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Cannot access an object that is not initialized. " + e.getMessage());
        }        
        // Example of handling ArrayIndexOutOfBoundsException
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds. " + e.getMessage());
        }
    }
}
