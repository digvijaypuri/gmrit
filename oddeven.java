//Oddeven Number
//Write and program to print odd string and even string
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println("The odd indexed elements are:");
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\nThe even indexed elements are:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}