public class simple_inheritancedemo {
    //WAP to demonstrate simgle level inheritance.
    //Parent class & Child class
    static class Parent {
        void displayParent() {
            System.out.println("This is the parent class.");
        }
    }

    static class Child extends Parent {
        void displayChild() {
            System.out.println("This is the child class.");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Create an object of the Child class
        Child childObject = new Child();

        // Call the method from the parent class
        childObject.displayParent();

        // Call the method from the child class
        childObject.displayChild();
    }   
}
