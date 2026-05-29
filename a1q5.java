//5.	Write a Java program to find the Greatest Common Divisor (GCD/HCF) of 	two numbers.
//Simple Java program to find the GCD/HCF of two numbers
import java.util.Scanner;
public class a1q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD/HCF of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}