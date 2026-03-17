package RecursionPrograms;

/**
 * Logic: n! = n * (n-1)!
 * Base Case: if n = 1 or 0, return 1.
 */
public class FactorialRecursion {
    public static void main(String[] args) {
        int number = 5;
        int result = findFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int findFactorial(int n) {
        // Base Case
        if (n <= 1) {
            return 1;
        }
        // Recursive Case
        return n * findFactorial(n - 1);
    }
}
