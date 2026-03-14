package MatrixPrograms;

public class ScalarMultiplication {
    public static void main(String[] args) {
        int[][] matrix = { 
            {1, 2, 3}, 
            {4, 5, 6} 
        };
        int k = 5; // The scalar value to multiply with

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        //  Multiply every element by k
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] * k;
            }
        }

        System.out.println("\nMatrix after Scalar Multiplication (k=" + k + "):");
        printMatrix(matrix);
    }

    //  method to handle the printing output
    private static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
