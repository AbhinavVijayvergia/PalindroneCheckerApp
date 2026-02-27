import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

/**
 * ================================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 13: Performance Comparison of Palindrome Algorithms
 *
 * Description:
 * This class demonstrates the comparison of execution time
 * for multiple palindrome checking algorithms, such as
 * Stack-based, Deque-based, and Case-Insensitive methods.
 *
 * Key Concepts:
 * - System.nanoTime(): Measure precise execution time
 * - Algorithm comparison: Evaluate performance differences
 *
 * Data Structures: Stack, Deque, String / Array
 *
 * Author: Developer
 * Version: 13.0
 */

public class PalindroneCheckerApp {

    /**
     * Stack-based palindrome check
     */
    public static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }
        return true;
    }

    /**
     * Deque-based palindrome check
     */
    public static boolean dequePalindrome(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Case-insensitive & space-ignored palindrome check
     */
    public static boolean normalizedPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = normalized.length() - 1;
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * ============================================================
     * Application Entry Point for UC13
     * ============================================================
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // --------------------------------------------------------
        // Step 1: Create Scanner Object for User Input
        // --------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("UC13: Performance Comparison");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // --------------------------------------------------------
        // Step 2: Measure execution time for Stack-based algorithm
        // --------------------------------------------------------
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long endStack = System.nanoTime();
        long stackTime = endStack - startStack;

        // --------------------------------------------------------
        // Step 3: Measure execution time for Deque-based algorithm
        // --------------------------------------------------------
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long endDeque = System.nanoTime();
        long dequeTime = endDeque - startDeque;

        // --------------------------------------------------------
        // Step 4: Measure execution time for Normalized algorithm
        // --------------------------------------------------------
        long startNormalized = System.nanoTime();
        boolean normalizedResult = normalizedPalindrome(input);
        long endNormalized = System.nanoTime();
        long normalizedTime = endNormalized - startNormalized;

        // --------------------------------------------------------
        // Step 5: Display results and execution times
        // --------------------------------------------------------
        System.out.println("\n===== Performance Results =====");
        System.out.println("Stack-based result: " + (stackResult ? "Palindrome" : "Not Palindrome") + ", Time: " + stackTime + " ns");
        System.out.println("Deque-based result: " + (dequeResult ? "Palindrome" : "Not Palindrome") + ", Time: " + dequeTime + " ns");
        System.out.println("Normalized result: " + (normalizedResult ? "Palindrome" : "Not Palindrome") + ", Time: " + normalizedTime + " ns");

        // --------------------------------------------------------
        // Step 6: Close Scanner Resource
        // --------------------------------------------------------
        scanner.close();
    }
}
