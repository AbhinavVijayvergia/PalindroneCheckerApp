import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

/**
 * ================================================================
 * MAIN CLASS – UseCase12PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates the Strategy design pattern
 * by allowing the palindrome checking algorithm to be
 * chosen dynamically at runtime. Different strategies
 * (Stack-based, Deque-based) can be applied without
 * changing the client code.
 *
 * Key Concepts:
 * - Interface: Define a contract for palindrome strategies
 * - Polymorphism: Use different strategy implementations
 * - Strategy Pattern: Encapsulate algorithms and switch dynamically
 *
 * Data Structure: Varies per strategy (Stack / Deque)
 *
 * Author: Developer
 * Version: 12.0
 */

/**
 * PalindromeStrategy interface – defines the contract for algorithms
 */
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

/**
 * Stack-based palindrome strategy
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/**
 * Deque-based palindrome strategy
 */
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String input) {
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
}

/**
 * ================================================================
 * MAIN APPLICATION CLASS – UseCase12PalindromeCheckerApp
 * ================================================================
 */
public class UseCase12PalindromeCheckerApp {

    /**
     * Application Entry Point for UC12
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // --------------------------------------------------------
        // Step 1: Create Scanner Object for User Input
        // --------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("UC12: Strategy Pattern for Palindrome Algorithms");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // --------------------------------------------------------
        // Step 2: Choose strategy at runtime
        // --------------------------------------------------------
        System.out.println("Choose strategy: 1=Stack, 2=Deque");
        int choice = scanner.nextInt();
        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        // --------------------------------------------------------
        // Step 3: Apply chosen strategy
        // --------------------------------------------------------
        boolean isPalindrome = strategy.isPalindrome(input);

        // --------------------------------------------------------
        // Step 4: Display Result
        // --------------------------------------------------------
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome (Strategy applied).");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        // --------------------------------------------------------
        // Step 5: Close Scanner Resource
        // --------------------------------------------------------
        scanner.close();
    }
}