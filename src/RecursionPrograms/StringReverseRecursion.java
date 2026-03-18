package RecursionPrograms;

/**
 * Logic: Take the first character and move it to the end of the 
 * reversed version of the remaining substring.
 * Base Case: If string is empty, return it.
 */
public class StringReverseRecursion {
    public static void main(String[] args) {
        String input = "GitHub";
        String reversed = reverse(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverse(String str) {
        // Base Case
        if (str.isEmpty()) {
            return str;
        }
        // Recursive Call: substring(1) moves to the next char
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
