//WAP to demonstrate the use of LinkedList in Java
//LinkedList is a part of Java's Collection Framework and is used to store a collection of elements. It allows for dynamic memory allocation and provides efficient insertion and deletion operations.
//In a LinkedList, each element is stored in a node, and each node contains a reference to the next node in the list. This allows for efficient insertion and deletion of elements, as the list does not need to be contiguous in memory like an array.
//Inplement all operations of LinkedList such as add, remove, get, etc. and print the list after each operation to demonstrate the functionality of LinkedList in Java.
import java.util.LinkedList;
public class linkedlistexample2 {   
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        // Adding elements to the LinkedList
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        System.out.println("LinkedList after adding elements: " + list);
        
        // Adding an element at the beginning
        list.addFirst("First Element");
        System.out.println("LinkedList after adding an element at the beginning: " + list);
        
        // Adding an element at the end
        list.addLast("Last Element");
        System.out.println("LinkedList after adding an element at the end: " + list);
        
        // Removing the first element
        list.removeFirst();
        System.out.println("LinkedList after removing the first element: " + list);
        
        // Removing the last element
        list.removeLast();
        System.out.println("LinkedList after removing the last element: " + list);
        
        // Getting an element at a specific index
        String elementAtIndex1 = list.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);
    }
}