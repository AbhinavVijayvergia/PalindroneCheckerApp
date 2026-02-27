import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome Checker
 *
 * Description:
 * This class checks whether a given string is a palindrome
 * while ignoring case differences and spaces. It normalizes
 * the input string before applying palindrome logic.
 *
 * Key Concepts:
 * - String Preprocessing: Remove spaces and normalize case
 * - Regular Expressions: Replace unwanted characters
 * - Data Structures: String / Character Array
 *
 * Author: Developer
 * Version: 10.0
 */

public class  PalindroneCheckerApp {

    /**
     * ============================================================
     * Method to check palindrome ignoring case and spaces
     * ============================================================
     *
     * @param str Input string
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        // --------------------------------------------------------
        // Step 1: Normalize string (lowercase and remove spaces)
        // --------------------------------------------------------
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        // --------------------------------------------------------
        // Step 2: Apply standard palindrome check using two-pointer
        // --------------------------------------------------------
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
     * Application Entry Point for UC10
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
        System.out.println("UC10: Case-Insensitive & Space-Ignored Palindrome Checker");
        System.out.print("Enter a string: ");

        // --------------------------------------------------------
        // Step 2: Read Input String from User
        // --------------------------------------------------------
        String input = scanner.nextLine();

        // --------------------------------------------------------
        // Step 3: Check palindrome after normalization
        // --------------------------------------------------------
        boolean isPalindrome = isPalindrome(input);

        // --------------------------------------------------------
        // Step 4: Display Result
        // --------------------------------------------------------
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        // --------------------------------------------------------
        // Step 5: Close Scanner Resource
        // --------------------------------------------------------
        scanner.close();
    }
}
