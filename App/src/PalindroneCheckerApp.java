
/**
 * ================================================================
 * MAIN CLASS – PalindroneCheckerApp
 * ================================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This class accepts a user input string and checks
 * if it is a palindrome by comparing characters
 * from both ends using a two-pointer approach.
 *
 * At this stage, the application:
 * - Converts the input string into a character array
 * - Uses two pointers to compare characters from start and end
 * - Determines if the string is a palindrome based on comparison
 * - Displays the result on the console
 *
 * This use case introduces array manipulation and
 * efficient palindrome checking logic.
 *
 * @author Developer
 * @version 4.0
 */

public class PalindroneCheckerApp {

    /**
     * ============================================================
     * Application Entry Point for UC4
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
        String input = scanner.nextLine();

        // --------------------------------------------------------
        // Step 3: Convert String to Character Array
        // --------------------------------------------------------
        char[] characters = input.toCharArray();

        // --------------------------------------------------------
        // Step 4: Use Two-Pointer Approach to Check Palindrome
        // --------------------------------------------------------
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        // --------------------------------------------------------
        // Step 3: Reverse the String Using a For Loop
        // --------------------------------------------------------
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String concatenation
        }

        // --------------------------------------------------------
        // Step 5: Display Result to User
        // --------------------------------------------------------
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        // --------------------------------------------------------
        // Step 6: Close Scanner Resource
        // --------------------------------------------------------
        scanner.close();
    }
}
