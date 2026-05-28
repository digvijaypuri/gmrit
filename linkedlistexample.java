//Create a program that adds names of students to a LinkedList and prints them.
//Write a program that adds the element "Mango" at the beginning and "Orange" at the end of the list.
//Create a program that removes the first and last elements from a LinkedList of colors and prints the list.
import java.util.LinkedList;
public class linkedlistexample {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        System.out.println("Students: " + students);
        
        LinkedList<String> fruits = new LinkedList<>();
        fruits.addFirst("Mango");
        fruits.addLast("Orange");
        System.out.println("Fruits: " + fruits);
        
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Colors before removal: " + colors);
        
        colors.removeFirst();
        colors.removeLast();
        System.out.println("Colors after removal: " + colors);
    }
}