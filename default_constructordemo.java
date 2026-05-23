public class default_constructordemo {
    // WAP to demonstrate the use of default constructor in Java.
    // Define a class named 'Car'
    static class Car {
        String brand;
        int year;

        // Default constructor
        Car() {
            this.brand = "Unknown";
            this.year = 0;
        }

        // Method to display car details
        void displayDetails() {
            System.out.println("Car Details:");
            System.out.println("Brand: " + brand);
            System.out.println("Year: " + year);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the Car class using the default constructor
        Car myCar = new Car();

        // Call the method to display car details
        myCar.displayDetails();
    }    
}