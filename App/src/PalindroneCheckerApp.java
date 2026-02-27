import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ================================================================
 * MAIN CLASS – UseCase6PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * both Queue and Stack data structures to highlight
 * the difference between FIFO (Queue) and LIFO (Stack).
 *
 * At this stage, the application:
 * - Accepts user input via Scanner
 * - Enqueues characters into a Queue (FIFO)
 * - Pushes characters onto a Stack (LIFO)
 * - Compares dequeued characters with popped characters
 * - Determines if the string is a palindrome
 *
 * Key Concepts:
 * - Queue: First In First Out (FIFO) principle
 * - Stack: Last In First Out (LIFO) principle
 * - Enqueue & Dequeue operations
 * - Logical comparison of Queue vs Stack output
 *
 * Data Structures: Queue, Stack
 *
 * Author: Developer
 * Version: 6.0
 */

public class PalindroneCheckerApp {

    /**
     * ============================================================
     * Application Entry Point for UC6
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
        System.out.println("UC6: Queue + Stack Based Palindrome Check");
        System.out.print("Enter a string: ");

        // --------------------------------------------------------
        // Step 2: Read Input String from User
        // --------------------------------------------------------
        String input = scanner.nextLine();

        // --------------------------------------------------------
        // Step 3: Initialize Queue and Stack
        // --------------------------------------------------------
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // --------------------------------------------------------
        // Step 4: Enqueue and Push characters
        // --------------------------------------------------------
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // Enqueue character
            stack.push(ch);  // Push character onto stack
        }

        // --------------------------------------------------------
        // Step 5: Compare dequeue vs pop
        // --------------------------------------------------------
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char dequeuedChar = queue.remove();
            char poppedChar = stack.pop();
            if (dequeuedChar != poppedChar) {
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
