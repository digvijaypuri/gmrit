//WAP Simple progarm for implementation of 2d array 
public class arraytraversal {
    public static void main(String[] args) {
        // Declare and initialize a 2D array of integers
        int[][] matrix = {
            {1, 2, 3}, // First row of the 2D array
            {4, 5, 6}, // Second row of the 2D array
            {7, 8, 9}  // Third row of the 2D array
        };
        // Print the elements of the 2D array
        System.out.println("The elements of the 2D array are:");
        for (int i = 0; i < matrix.length; i++) { // Loop through each row
            for (int j = 0; j < matrix[i].length; j++) { // Loop through each column in the current row
                System.out.print(matrix[i][j] + " "); // Print the current element followed by a space
            }
            System.out.println(); // Move to the next line after printing all columns in the current row
        }
    }    
}