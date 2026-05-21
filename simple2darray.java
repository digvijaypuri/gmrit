public class simple2darray {
//WAP to create the simple 2D Array
    public static void main(String[] args) {
        // Declare and initialize a 2D array of integers
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // Print the elements of the 2D array
        System.out.println("The elements of the 2D array are:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }    
}
