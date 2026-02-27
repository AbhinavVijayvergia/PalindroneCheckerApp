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

/**
 * ================================================================
 * MAIN CLASS – PalindroneCheckerApp
 * ================================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class checks whether a given string is a palindrome
 * by leveraging the Stack data structure to reverse
 * the input string.
 *
 * At this stage, the application:
 * - Takes user input via Scanner
 * - Pushes each character of the input string onto a stack
 * - Pops characters from the stack to compare with original string
 * - Determines palindrome status based on character comparisons
 * - Prints the result on the console
 *
 * This use case introduces the Stack collection and
 * demonstrates LIFO (Last In First Out) usage for palindrome checking.
 *
 * @author Developer
 * @version 5.0
 */

public class PalindroneCheckerApp {

    /**
     * ============================================================
     * Application Entry Point for UC5
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
        // Step 3: Initialize Stack and Push Characters
        // --------------------------------------------------------
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // --------------------------------------------------------
        // Step 4: Pop Characters and Compare to Original String
        // --------------------------------------------------------
        boolean isPalindrome = true;
        for (int i = 0; i < input.length(); i++) {
            char poppedChar = stack.pop();
            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // --------------------------------------------------------
        // Step 5: Display Palindrome Check Result
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
