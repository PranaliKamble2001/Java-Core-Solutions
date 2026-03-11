package StringPrograms
import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        // Clean the strings (remove spaces and make lowercase)
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) return false;

        // Convert to arrays and sort
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        // If sorted arrays are equal, it's an anagram
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        System.out.println("Are 'Listen' and 'Silent' anagrams? " + isAnagram("Listen", "Silent"));
    }
}
