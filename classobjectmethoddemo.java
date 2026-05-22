public class classobjectmethoddemo {
//WAP to simple demonstrate the use of class, object and method in Java. 
    // Define a class named 'Car'
    static class Car {
        // Method to display car details
        void displayDetails() {
            System.out.println("Car Details:");
            System.out.println("Make: Toyota");
            System.out.println("Model: Camry");
            System.out.println("Year: 2020");
        }
    }
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();

        // Call the method to display car details using the object
        myCar.displayDetails();
    }

}
