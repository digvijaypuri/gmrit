public class builtinmethoddemo {
    //write a simple program to demonstrate the use of 10 common built-in methods like(length,charAt,substring,equals,toUpperCase, toLowerCase, indexOf,replace,trim, startsWith , endsWith, split) and comment every line in Java
public static void main(String[] args) {
        String str = " Hello Java ";

        // Length of the string
        System.out.println("Length: " + str.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Character at index 1
        System.out.println("Character at 1: " + str.charAt(1));

        // Substring from index 0 to 5
        System.out.println("Substring: " + str.substring(0,5));

        // Check if string contains "Java"
        System.out.println("Contains Java: " + str.contains("Java"));

        // Replace "Java" with "World"
        System.out.println("Replace: " + str.replace("Java", "World"));

        // Trim leading and trailing whitespace
        System.out.println("Trimmed: '" + str.trim() + "'");

        // Check if string starts with " Hello"
        System.out.println("Starts with ' Hello': " + str.startsWith(" Hello"));

        // Check if string ends with " "
        System.out.println("Ends with ' ': " + str.endsWith(" "));
    }
}