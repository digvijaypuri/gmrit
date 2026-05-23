//WAP to implement hierarchical inheritance.
public class inheitance_hierarchical { 
    // Parent class
    static class Parent {
        void displayParent() {
            System.out.println("This is the parent class.");
        }
    }
    // First child class
    static class Child1 extends Parent {
        void displayChild1() {
            System.out.println("This is the first child class.");
        }
    }
    // Second child class
    static class Child2 extends Parent {
        void displayChild2() {
            System.out.println("This is the second child class.");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Create an object of the first child class
        Child1 child1Object = new Child1();
        // Call the method from the parent class
        child1Object.displayParent();
        // Call the method from the first child class
        child1Object.displayChild1();

        // Create an object of the second child class
        Child2 child2Object = new Child2();
        // Call the method from the parent class
        child2Object.displayParent();
        // Call the method from the second child class
        child2Object.displayChild2();
    }
}