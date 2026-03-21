package NumberPrograms;

import java.util.Scanner;

/**
 * Concept: Palindrome Number
 * Logic: Reverse the digits and compare with the original number.
 * Example: 121 reversed is 121 (True), 123 reversed is 321 (False).
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int temp = num;
        int reversedNum = 0;

        // Step 1: Reverse the digits
        while (temp > 0) {
            int digit = temp % 10;
            reversedNum = (reversedNum * 10) + digit;
            temp /= 10;
        }

        // Step 2: Compare reversed with original
        if (num == reversedNum) {
            System.out.println(num + " is a Palindrome Number.");
        } else {
            System.out.println(num + " is NOT a Palindrome Number.");
        }
        sc.close();
    }
}
