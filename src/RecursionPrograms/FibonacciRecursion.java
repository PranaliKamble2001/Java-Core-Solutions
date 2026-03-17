package RecursionPrograms;

/**
 * Logic: fib(n) = fib(n-1) + fib(n-2)
 * Base Case: if n is 0 or 1, return n.
 */
public class FibonacciRecursion {
    public static void main(String[] args) {
        int count = 10;
        System.out.println("Fibonacci Series up to " + count + " terms:");
        for (int i = 0; i < count; i++) {
            System.out.print(findFibonacci(i) + " ");
        }
    }

    public static int findFibonacci(int n) {
        // Base Case
        if (n <= 1) {
            return n;
        }
        // Recursive Case
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
