//WAP to count the frequency of alpabhats in paragraph
//Simple program to count the frequency of alphabets in a paragraph using HashMap
import java.util.HashMap; // Importing the HashMap class from the java.util package
import java.util.Scanner; // Importing the Scanner class for user input 
public class frequencymapdemo1 { // Declaring a public class named frequencymapdemo1
    public static void main(String[] args) { // Main method which is the entry point of the program
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read user input
        System.out.println("Enter a paragraph:"); // Prompting the user to enter a paragraph
        String paragraph = sc.nextLine(); // Reading the entire line of input as a string
        HashMap<Character, Integer> frequencyMap = new HashMap<>(); // Creating a HashMap to store the frequency of each character
        for (char ch : paragraph.toCharArray()) { // Looping through each character in the paragraph
            if (Character.isLetter(ch)) { // Checking if the character is an alphabet
                ch = Character.toLowerCase(ch); // Converting the character to lowercase for case-insensitive counting
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1); // Updating the frequency count for each character
            }
        }
        System.out.println("Alphabet Frequency: " + frequencyMap); // Printing the frequency map of alphabets
    }
}