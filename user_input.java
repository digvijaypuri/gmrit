//WAP that takes input from the user and displays it.   
import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}