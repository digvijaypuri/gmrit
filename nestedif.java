public class nestedif {
    public static void main(String[] args) {
        int num = 11;
        if (num > 0) {
            System.out.println(num + " is a positive number.");
            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            } else {
                System.out.println(num + " is an odd number.");
            }
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println(num + " is zero.");
        }
    }
}
