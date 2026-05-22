public class constructordemo {
    // WAP to simple demonstrate the use of constructor in Java.
    // Define a class named 'Animal'
    static class Animal {
        String name;
        int age;

        // Constructor
        Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display animal details
        void displayDetails() {
            System.out.println("Animal Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the Animal class using the constructor
        Animal myAnimal = new Animal("Dog", 5);

        // Call the method to display animal details
        myAnimal.displayDetails();
    }
}