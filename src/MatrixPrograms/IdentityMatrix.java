package MatrixPrograms;

public class IdentityMatrix {
    public static void main(String[] args) {
        int size = 3;
        int[][] matrix = new int[size][size];

        // 1. Generation Logic
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = 1; // Diagonal elements
                } else {
                    matrix[i][j] = 0; // All other elements
                }
            }
        }

        // 2. Output Logic (Printing the Grid)
        System.out.println("Generated " + size + "x" + size + " Identity Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
