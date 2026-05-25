//Polymorphism with interfaces with comment
public class poly_interfaces {
    // Define an interface
    interface Animal {
        void makeSound();
    }

    // Implement the interface in a class
    static class Dog implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog ba");
        }
    }

    // Implement the interface in another class
    static class Cat implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        // Create objects of the implementing classes
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call the method, which will invoke the overridden method in the respective classes
        dog.makeSound();
        cat.makeSound();
    }
}