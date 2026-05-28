import java.util.ArrayList;
public class arraylistdemo {
//WAP that demonstrates the use of ArrayList in Java.
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();
        // Add some elements to the ArrayList
        list.add("Hello");
        list.add("World");
        list.add("Java");
        // Display the elements in the ArrayList
        System.out.println("ArrayList: " + list);
        // Remove an element from the ArrayList
        list.remove("World");
        // Display the elements after removal
        System.out.println("ArrayList after removal: " + list);
    }    
}
