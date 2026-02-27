import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS – UseCase7PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class demonstrates an optimized palindrome check
 * using a Deque (Double Ended Queue) to compare characters
 * from the front and rear ends of the input string.
 *
 * At this stage, the application:
 * - Accepts user input via Scanner
 * - Inserts each character into a Deque
 * - Compares first and last characters using removeFirst() and removeLast()
 * - Continues comparison until Deque is empty
 * - Determines if the string is a palindrome
 *
 * Key Concepts:
 * - Deque: Double Ended Queue allowing insertion and deletion
 *   from both ends
 * - Optimized palindrome checking without reversal structures
 * - Efficient front/rear character comparison
 *
 * Data Structure: Deque
 *
 * Author: Developer
 * Version: 7.0
 */

public class PalindroneCheckerApp {

    /**
     * ============================================================
     * Application Entry Point for UC7
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
        System.out.println("UC7: Deque-Based Optimized Palindrome Checker");
        System.out.print("Enter a string: ");

        // --------------------------------------------------------
        // Step 2: Read Input String from User
        // --------------------------------------------------------
        String input = scanner.nextLine();

        // --------------------------------------------------------
        // Step 3: Initialize Deque
        // --------------------------------------------------------
        Deque<Character> deque = new LinkedList<>();

        // --------------------------------------------------------
        // Step 4: Insert Characters into Deque
        // --------------------------------------------------------
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));  // Add character to rear
        }

        // --------------------------------------------------------
        // Step 5: Compare Front and Rear Characters
        // --------------------------------------------------------
        boolean isPalindrome = true;

        while (deque.size() > 1) { // Compare until 0 or 1 elements left
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // --------------------------------------------------------
        // Step 6: Display Result
        // --------------------------------------------------------
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        // --------------------------------------------------------
        // Step 7: Close Scanner Resource
        // --------------------------------------------------------
        scanner.close();
    }
}
