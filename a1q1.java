//1.Write a simple Java program to find the sum of digits of a given number.
import java.util.Scanner;
public class a1q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}