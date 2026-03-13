package MatrixPrograms;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] grid = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int target = 50;
        boolean found = false;

        // Logic: Linear Search in 2D Space
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == target) {
                    System.out.println("Element " + target + " found at: Row " + i + ", Col " + j);
                    found = true;
                    break; 
                }
            }
        }

        if (!found) System.out.println("Element not found.");
    }
}
