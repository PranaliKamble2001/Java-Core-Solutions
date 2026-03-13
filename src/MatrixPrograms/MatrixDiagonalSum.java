package MatrixPrograms;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        // Logic: In a diagonal, row index 'i' always equals column index 'i'
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Sum of primary diagonal: " + sum);
    }
}
