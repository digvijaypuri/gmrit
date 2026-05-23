public class default_constructordemo1 {
    //example of default constructor
    static class Person {
        String name;
        int age;
        // Default constructor
        Person() {
            this.name = "Unknown";
            this.age = 0;
        }
        // Method to display person details
        void displayDetails() {
            System.out.println("Person Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
    // Main method
    public static void main(String[] args) {    
        // Create an object of the Person class using the default constructor
        Person person1 = new Person();
        // Call the method to display person details
        person1.displayDetails();
    }
}
