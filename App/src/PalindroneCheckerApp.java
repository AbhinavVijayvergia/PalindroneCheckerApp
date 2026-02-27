/**
 * ================================================================
 * MAIN CLASS – UseCase2PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Reverses the string using loop logic
 * - Compares the original and reversed strings
 * - Displays the result on the console
 *
 * This use case introduces fundamental string manipulation
 * and comparison logic before taking user input.
 *
 * @author Developer
 * @version 2.0
 */

public class UseCase2PalindromeCheckerApp {

    /**
     * ============================================================
     * Application Entry Point for UC2
     * ============================================================
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // --------------------------------------------------------
        // Step 1: Store Hardcoded String (String Literal)
        // --------------------------------------------------------
        String word = "madam";

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("UC2: Print a Hardcoded Palindrome Result");
        System.out.println("Hardcoded String: " + word);

        // --------------------------------------------------------
        // Step 2: Reverse the String Using Loop Logic
        // --------------------------------------------------------
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // --------------------------------------------------------
        // Step 3: Compare Original and Reversed Strings
        // --------------------------------------------------------
        if (word.equals(reversed)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        // --------------------------------------------------------
        // Step 4: Exit Message
        // --------------------------------------------------------
        System.out.println("Program exited successfully.");
    }
}
