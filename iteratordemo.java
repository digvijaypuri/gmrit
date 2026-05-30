//WAP to implement the concept of iteration in java.
//Use the collection arraylist
//Remove an element from the array list during iterations
//Comment Every Line
import java.util.ArrayList; // Importing the ArrayList class from the java.util package
import java.util.Iterator; // Importing the Iterator interface from the java.util package
public class iteratordemo { // Declaring a public class named iterationdemo
    public static void main(String[] args) { // Main method which is the entry point of the program
        ArrayList<String> list = new ArrayList<>(); // Creating an ArrayList of Strings named list
        list.add("Apple"); // Adding "Apple" to the list
        list.add("Banana"); // Adding "Banana" to the list
        list.add("Cherry"); // Adding "Cherry" to the list
        list.add("Date"); // Adding "Date" to the list
        System.out.println("Original List: " + list); // Printing the original list
        Iterator<String> iterator = list.iterator(); // Creating an iterator for the list
        while (iterator.hasNext()) { // Looping through the list using the iterator
            String fruit = iterator.next(); // Getting the next element in the list
            if (fruit.equals("Banana")) { // Checking if the current element is "Banana"
                iterator.remove(); // Removing "Banana" from the list using the iterator's remove method
            }
        }
        System.out.println("List after removing 'Banana': " + list); // Printing the modified list after removal
    }
}