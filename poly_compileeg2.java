//Example2 of Runtime Polymorphism
public class poly_compileeg2 {
    // Parent class
    static class Parent {
        void display() {
            System.out.println("This is the parent class.");
        }
    }
    // Child class that overrides the display method
    static class Child extends Parent {
        @Override
        void display() {
            System.out.println("This is the child class, overriding the parent class method.");
        }
    }
    public static void main(String[] args) {
        // Create an object of the Child class
        Child childObject = new Child();
        // Call the display method, which will invoke the overridden method in the Child class
        childObject.display();
    }
}