/**
 * Project: Java Core Technical Solutions
 * Feature: Easy Palindrome Check
 */
public class StringLogic {

    public static void main(String[] args) {
        String word = "Level"; // Change this to test other words like "Java" or "Radar"
        
        // Step 1: Normalize the string (lowercase)
        String cleanWord = word.toLowerCase();
        
        // Step 2: Check logic
        if (isPalindrome(cleanWord)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }

    /**
     * Logic: Compare characters from start and end moving inwards.
     */
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;  // Move right
            right--; // Move left
        }
        return true; // Is a palindrome
    }
}
