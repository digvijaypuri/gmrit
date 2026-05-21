public class prepost {
//Write and simple program to demonstrate the use of pre and post increment operators
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        // Using post-increment operator
        System.out.println("Post-increment:");
        //System.out.println("Value of a before post-increment: " + a); // Output: 5
        //System.out.println("Value of a during post-increment: " + a++); // Output: 5 (then a becomes 6)
        System.out.println("Value of a after post-increment: " + a++); // Output: 6

        // Using pre-increment operator
        System.out.println("\nPre-increment:");
        //System.out.println("Value of b before pre-increment: " + b); // Output: 5
        //System.out.println("Value of b during pre-increment: " + ++b); // Output: 6 (b becomes 6 before printing)
        System.out.println("Value of b after pre-increment: " + ++b); // Output: 6
    }
}