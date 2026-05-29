//2.Write a Java program to reverse a number.
import java.util.Scanner;
public class a1q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println("The reversed number is: " + reversed);
    }
}