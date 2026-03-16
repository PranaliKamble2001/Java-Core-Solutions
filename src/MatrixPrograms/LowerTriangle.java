package MatrixPrograms;

/**
 * Logic: A Lower Triangular Matrix is one where all elements 
 * ABOVE the main diagonal are zero.
 * Condition: If row index (i) < column index (j), set to 0.
 */
public class LowerTriangle {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("--- Original Matrix ---");
        displayMatrix(matrix);

        System.out.println("\n--- Lower Triangular Matrix ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j <= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
