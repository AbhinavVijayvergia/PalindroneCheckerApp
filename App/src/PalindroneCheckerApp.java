import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS – PalindroneCheckerApp
 * ================================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This class allows the user to input a string and
 * checks whether it is a palindrome by reversing
 * the string and comparing it with the original.
 *
 * At this stage, the application:
 * - Accepts user input via Scanner
 * - Reverses the input string using a for loop
 * - Compares the original and reversed strings
 * - Displays the palindrome check result on the console
 *
 * This use case demonstrates string reversal and
 * basic user interaction.
 *
 * @author Developer
 * @version 3.0
 */

public class PalindroneCheckerApp {

    /**
     * ============================================================
     * Application Entry Point for UC3
     * ============================================================
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // --------------------------------------------------------
        // Step 1: Create Scanner Object for User Input
        // --------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC3: Palindrome Check Using String Reverse ===");
        System.out.print("Enter a string: ");

        // --------------------------------------------------------
        // Step 2: Read Input String from User
        // --------------------------------------------------------
        String original = scanner.nextLine();

        // --------------------------------------------------------
        // Step 3: Reverse the String Using a For Loop
        // --------------------------------------------------------
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String concatenation
        }

        // --------------------------------------------------------
        // Step 4: Compare Original and Reversed Strings
        // --------------------------------------------------------
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        // --------------------------------------------------------
        // Step 5: Close Scanner Resource
        // --------------------------------------------------------
        scanner.close();
    }
}
