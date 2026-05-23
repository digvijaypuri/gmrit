public class inheritance_multiple {
//WAP to implement multiple inheritance with the help of interfaces in Java.
//Simple not use overriding in this program.
    // First interface
    interface Interface1 {
        void displayInterface1();
    }
    // Second interface
    interface Interface2 {
        void displayInterface2();
    }
    // Class that implements both interfaces
    static class MultipleInheritanceDemo implements Interface1, Interface2 {
        // Implementing method from Interface1
        public void displayInterface1() {
            System.out.println("This is the first interface.");
        }
        // Implementing method from Interface2
        public void displayInterface2() {
            System.out.println("This is the second interface.");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Create an object of the MultipleInheritanceDemo class
        MultipleInheritanceDemo demoObject = new MultipleInheritanceDemo();
        // Call the methods from both interfaces
        demoObject.displayInterface1();
        demoObject.displayInterface2();
    }
}
