//7.	Write a Java program to calculate the factorial of a number.
//Write a simple Java program to calculate the factorial of a number
import java.util.Scanner;
public class a1q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        long factorial = calculateFactorial(num);
        System.out.println("The factorial of " + num + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}