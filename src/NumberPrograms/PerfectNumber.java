package NumberPrograms;

import java.util.Scanner;

/**
 * Logic: A perfect number is equal to the sum of its positive divisors (excluding itself).
 * Optimization: Only loop up to n/2, as no divisor can be greater than half the number.
 */
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        int sum = 0;

        // Loop to find divisors and calculate their sum
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        // Final Verification
        if (sum == n && n != 0) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is NOT a Perfect Number.");
        }
        
        sc.close();
    }
}
