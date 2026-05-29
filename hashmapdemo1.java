//WAP an program to implement the hash map in java
//PUT,GET,Search,Delete
import java.util.HashMap;
import java.util.Scanner;   
public class hashmapdemo1 {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String number = sc.nextLine();
                    phoneBook.put(name, number);
                    System.out.println("Contact added.");
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    if (phoneBook.containsKey(name)) {
                        System.out.println("Phone number: " + phoneBook.get(name));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    if (phoneBook.containsKey(name)) {
                        System.out.print("Enter new phone number: ");
                        number = sc.nextLine();
                        phoneBook.put(name, number);
                        System.out.println("Contact updated.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    if (phoneBook.containsKey(name)) {
                        phoneBook.remove(name);
                        System.out.println("Contact deleted.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}
