//WAP to demonstrate the use of 3 built-in packages in Java.
import java.time.LocalDate; // Importing LocalDate class from java.time package for handling dates
import java.util.Random; // Importing Random class from java.util package for generating random numbers
import java.util.Scanner; // Importing Scanner class from java.util package for user input 
public class bultin_pkgdemo {
    public static void main(String[] args) {
        // Using Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Using Random to generate a random number
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Generate a random number between 0 and 99
        
        // Using LocalDate to get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Displaying the results
        System.out.println("Hello, " + name + "!");
        System.out.println("Your random number is: " + randomNumber);
        System.out.println("Today's date is: " + currentDate);
        
        // Closing the scanner
        scanner.close();
    }
}