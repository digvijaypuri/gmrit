//WAP to create a link list and perform addition, insertion, deletion, retrival, traversing operation on it.
import java.util.LinkedList;
public class linklistdemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("LinkedList: " + list);
        System.out.println("Element at index 1: " + list.get(1));
        list.set(1, "Blueberry");
        System.out.println("Modified LinkedList: " + list);
        list.remove(0);
        System.out.println("LinkedList after removal: " + list);
        System.out.println("Size of the LinkedList: " + list.size());
    }
}
