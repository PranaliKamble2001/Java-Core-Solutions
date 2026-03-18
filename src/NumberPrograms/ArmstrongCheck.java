package NumberPrograms;

import java.util.Scanner;

/**
 * Logic: Sum of (digits ^ count of digits) == original number.
 * Example: 153 -> (1*1*1) + (5*5*5) + (3*3*3) = 153.
 */
public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int temp = num;
        int digits = 0;
        int sum = 0;

        // Step 1: Count number of digits
        int countTemp = num;
        while (countTemp > 0) {
            countTemp /= 10;
            digits++;
        }

        // Step 2: Calculate sum of powers
        temp = num;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }

        // Step 3: Final Comparison
        if (num == sum) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
        sc.close();
    }
}
