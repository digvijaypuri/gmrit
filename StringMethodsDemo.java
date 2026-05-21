public class StringMethodsDemo {
    // Write a simple program to demonstrate the use of some common String built-in methods in Java
    public static void main(String[] args) {
        String str = "Hello Java";

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at 1: " + str.charAt(1));
        System.out.println("Substring: " + str.substring(0,5));
        System.out.println("Contains Java: " + str.contains("Java"));
        System.out.println("Replace: " + str.replace("Java", "World"));
    }
}