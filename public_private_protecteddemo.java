//WAP to implement the concept of public, private and protected in java with simple example.
//Create car class with public, private and protected members and demonstrate their usage.
public class public_private_protecteddemo {
    // Public member can be accessed from anywhere
    public String brand = "Toyota";
    
    // Private member can only be accessed within the class
    private String model = "Corolla";
    
    // Protected member can be accessed within the same package and subclasses
    protected int year = 2020;
    
    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
    public static void main(String[] args) {
        public_private_protecteddemo car = new public_private_protecteddemo();
        car.displayDetails();
        
        // Accessing public member directly
        System.out.println("Accessing public member: " + car.brand);
        
        // Accessing private member directly (not possible, will cause a compile-time error)
        // Accessing private member
        // Possible because main() is inside same class
        System.out.println("Accessing private member: " + car.model); // Uncommenting this line will cause an error
        
        // Accessing protected member directly
        System.out.println("Accessing protected member: " + car.year);
    }
}
