public class StringBufferExample {
    // Write a simple program to demonstrate the use of StringBuffer in Java
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Append a string to the StringBuffer
        stringBuffer.append(" World");
        System.out.println("After appending: " + stringBuffer); // Output: Hello World

        // Insert a string at a specific index
        stringBuffer.insert(5, ",");
        System.out.println("After inserting: " + stringBuffer); // Output: Hello, World

        // Replace a portion of the StringBuffer
        stringBuffer.replace(6, 11, "Java");
        System.out.println("After replacing: " + stringBuffer); // Output: Hello, Java

        // Delete a portion of the StringBuffer
        stringBuffer.delete(5, 6);
        System.out.println("After deleting: " + stringBuffer); // Output: Hello Java

        // Reverse the StringBuffer
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer); // Output: avaJ olleH
    }
}
