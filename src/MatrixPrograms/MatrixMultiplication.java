package MatrixPrograms;

public class MatrixMultiplication {
    public static void main(String[] args) {
        // Matrix A (2x3)
        int[][] A = { {1, 2, 3}, {4, 5, 6} };
        // Matrix B (3x2)
        int[][] B = { {7, 8}, {9, 10}, {11, 12} };

        int r1 = A.length;    
        int c1 = A[0].length;
        int c2 = B[0].length;

        // Result matrix will be r1 x c2
        int[][] product = new int[r1][c2];

        // The "Triple Loop" Logic
        for (int i = 0; i < r1; i++) {           
            for (int j = 0; j < c2; j++) {       
                for (int k = 0; k < c1; k++) {   
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("--- Result of Matrix Multiplication ---");
        for (int[] row : product) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
