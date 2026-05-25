//WAP to demonstrate simple implementation of runtime polymorphism
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class polymorphism_compile {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();
        // Call the sound method, which will invoke the overridden method in the Dog class
        dog.sound();
    }
}