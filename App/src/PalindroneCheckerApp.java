import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS – UseCase9PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class checks whether a given string is a palindrome
 * using recursion. It compares characters from the start
 * and end positions recursively until all pairs match or
 * a mismatch is found.
 *
 * Key Concepts:
 * - Recursion: A method calling itself to solve smaller problems
 * - Base Condition: Prevents infinite recursion and terminates calls
 * - Call Stack: Memory structure managing recursive calls
 *
 * Data Structure: Call Stack
 *
 * Author: Developer
 * Version: 9.0
 */

public class PalindroneCheckerApp {

    /**
     * ============================================================
     * Recursive Method to Check Palindrome
     * ============================================================
     *
     * @param str Input string
     * @param start Start index for comparison
     * @param end End index for comparison
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base condition: Single character or crossed indices
        if (start >= end) {
            return true;
        }

        // If characters at start and end do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call: move towards the center
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    /**
     * ============================================================
     * Application Entry Point for UC9
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
        System.out.println("UC9: Recursive Palindrome Checker");
        System.out.print("Enter a string: ");

        // --------------------------------------------------------
        // Step 2: Read Input String from User
        // --------------------------------------------------------
        String input = scanner.nextLine();

        // --------------------------------------------------------
        // Step 3: Call Recursive Method
        // --------------------------------------------------------
        boolean isPalindrome = isPalindromeRecursive(input, 0, input.length() - 1);

        // --------------------------------------------------------
        // Step 4: Display Result
        // --------------------------------------------------------
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        // --------------------------------------------------------
        // Step 5: Close Scanner Resource
        // --------------------------------------------------------
        scanner.close();
    }
}
