public class accessmodifiers {
//WAP to demonstrate the use of different access modifiers in Java
    // Public class can be accessed from anywhere
    public class PublicClass {
        public void display() {
            System.out.println("This is a public class.");
        }
    }
    // Private class can only be accessed within the enclosing class
    private class PrivateClass {
        public void display() {
            System.out.println("This is a private class.");
        }
    }
    // Protected class can be accessed within the same package and subclasses
    protected class ProtectedClass {
        public void display() {
            System.out.println("This is a protected class.");
        }
    }
    // Default (package-private) class can be accessed only within the same package
    class DefaultClass {
        public void display() {
            System.out.println("This is a default (package-private) class.");
        }
    }
    public static void main(String[] args) {
        accessmodifiers outer = new accessmodifiers();
        
        // Accessing the public class
        PublicClass publicObj = outer.new PublicClass();
        publicObj.display();
        
        // Accessing the private class (not possible, will cause a compile-time error)
        // PrivateClass privateObj = outer.new PrivateClass(); // Uncommenting this line will cause an error
        
        // Accessing the protected class
        ProtectedClass protectedObj = outer.new ProtectedClass();
        protectedObj.display();
        
        // Accessing the default class
        DefaultClass defaultObj = outer.new DefaultClass();
        defaultObj.display();
    }    
}
