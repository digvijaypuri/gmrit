//WAP to implement the method overloading in java
public class poly_overloading {
    // Method with no parameters
    void display() {
        System.out.println("This is the display method with no parameters.");
    }
    // Method with one parameter
    void display(int a) {
        System.out.println("This is the display method with one parameter: " + a);
    }
    // Method with two parameters
    void display(int a, int b) {
        System.out.println("This is the display method with two parameters: " + a + " and " + b);
    }
    public static void main(String[] args) {
        poly_overloading obj = new poly_overloading();
        obj.display();          // Calls the method with no parameters
        obj.display(5);         // Calls the method with one parameter
        obj.display(5, 10);     // Calls the method with two parameters
    }
}
