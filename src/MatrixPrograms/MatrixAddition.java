package MatrixPrograms;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] A = { {1, 1}, {1, 1} };
        int[][] B = { {2, 2}, {2, 2} };
        
        int rows = A.length;
        int cols = A[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of Matrices:");
        for (int[] row : sum) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
