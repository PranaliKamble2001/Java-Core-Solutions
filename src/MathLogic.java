/**
 * Project: Java Core Technical Solutions
 * Feature: Array Min/Max Finder
 */
public class MathLogic {
    public static void main(String[] args) {
        int[] scores = {45, 88, 12, 99, 56};
        
        int max = scores[0];
        int min = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) max = scores[i];
            if (scores[i] < min) min = scores[i];
        }

        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);
    }
}
