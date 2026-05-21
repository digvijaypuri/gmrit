//Simple Array Traversal (Iterating Over an Array) collect the size,elements from the user at the end modified with index position and print the array
import java.util.Scanner;
public class modifyarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the index position to modify:");
        int index = sc.nextInt();
        System.out.println("Enter the new value:");
        int newValue = sc.nextInt();
        if (index >= 0 && index < size) {
            arr[index] = newValue;
            System.out.println("The modified array is:");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Invalid index position.");
        }
    }
}