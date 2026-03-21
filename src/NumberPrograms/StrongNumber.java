package NumberPrograms;

import java.util.Scanner;

/**
 * Concept: Strong Number
 * Logic: A number is "Strong" if the sum of the factorials of its digits 
 * equals the original number.
 * Example: 145 = 1! + 4! + 5! -> 1 + 24 + 120 = 145.
 */
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        
        int temp = num;
        int totalSum = 0;

        // Extract each digit
        while (temp > 0) {
            int digit = temp % 10;
            
            // Calculate factorial of the current digit
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            
            totalSum += fact;
            temp /= 10;
        }

        // Final verification
        if (totalSum == num && num != 0) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is NOT a Strong Number.");
        }
        
        sc.close();
    }
}
