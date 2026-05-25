//WAP You can have a move() method for all types of vehicles. But a car moves in a specific way, a bike moves differently, and a plane moves even differently. The move() method can behave differently for each type of vehicle (polymorphism).
public class poly_vehicleeg {
    // Base class
    static class Vehicle {
        void move() {
            System.out.println("The vehicle is moving");
        }
    }
    // Derived class for Car
    static class Car extends Vehicle {
        @Override
        void move() {
            System.out.println("The car is moving on the road");
        }
    }
    // Derived class for Bike
    static class Bike extends Vehicle {
        @Override
        void move() {
            System.out.println("The bike is moving on the road");
        }
    }
    // Derived class for Plane
    static class Plane extends Vehicle {
        @Override
        void move() {
            System.out.println("The plane is flying in the sky");
        }
    }
    public static void main(String[] args) {
        // Create objects of each vehicle type
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        Vehicle myPlane = new Plane();
        
        // Call the move method for each vehicle, demonstrating polymorphism
        myCar.move();   // Output: The car is moving on the road
        myBike.move();  // Output: The bike is moving on the road
        myPlane.move(); // Output: The plane is flying in the sky
    }
}
