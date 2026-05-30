//WAP to demonstrate the usage of HashMap to count the frequency of elements in an array
//WAP to implement the simple iteration in java
import java.util.HashMap; // Importing the HashMap class from the java.util package
public class frequencymapdemo { // Declaring a public class named frequencymapdemo
    public static void main(String[] args) { // Main method which is the entry point of the program
        int[] arr = {1, 2, 3, 2, 4, 1, 5}; // Initializing an array of integers
        HashMap<Integer, Integer> frequencyMap = new HashMap<>(); // Creating a HashMap to store the frequency of each element
        for (int num : arr) { // Looping through each element in the array
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); // Updating the frequency count for each element
        }
        System.out.println("Element Frequency: " + frequencyMap); // Printing the frequency map
    }
}