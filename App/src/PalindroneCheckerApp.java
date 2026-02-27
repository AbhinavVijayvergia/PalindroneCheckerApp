import java.util.Scanner;
import java.util.Stack;

/**
 * ================================================================
 * MAIN CLASS – UseCase11PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates an object-oriented approach to
 * palindrome checking by encapsulating the logic inside
 * a dedicated PalindromeChecker class.
 *
 * Key Concepts (OOP):
 * - Encapsulation: Hides internal implementation details
 * - Single Responsibility Principle: PalindromeChecker class
 *   handles only palindrome logic
 *
 * Data Structure: Internal (Stack / Array)
 *
 * Author: Developer
 * Version: 11.0
 */

class PalindromeChecker {

    /**
     * Method to check whether a string is a palindrome
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters and compare with original string
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/**
 * ================================================================
 * MAIN APPLICATION CLASS – UseCase11PalindromeCheckerApp
 * ================================================================
 */
public class UseCase11PalindromeCheckerApp {

    /**
     * Application Entry Point for UC11
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // --------------------------------------------------------
        // Step 1: Create Scanner Object for User Input
        // --------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("UC11: Object-Oriented Palindrome Service");
        System.out.print("Enter a string: ");

        // --------------------------------------------------------
        // Step 2: Read Input String from User
        // --------------------------------------------------------
        String input = scanner.nextLine();

        // --------------------------------------------------------
        // Step 3: Create PalindromeChecker Object and Check Palindrome
        // --------------------------------------------------------
        PalindromeChecker checker = new PalindromeChecker();
        boolean isPalindrome = checker.checkPalindrome(input);

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