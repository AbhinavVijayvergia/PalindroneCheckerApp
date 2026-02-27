import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS – UseCase8PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class demonstrates a palindrome check using
 * a singly linked list. It converts the input string
 * into a linked list, reverses the second half, and
 * compares the two halves to determine if the string
 * is a palindrome.
 *
 * Key Concepts:
 * - Singly Linked List: Dynamic data structure using nodes
 * - Node Traversal: Sequential access using next references
 * - Fast and Slow Pointer Technique: Find middle efficiently
 * - In-Place Reversal: Reverse second half without extra memory
 *
 * Data Structure: Singly Linked List
 *
 * Author: Developer
 * Version: 8.0
 */

public class UseCase8PalindromeCheckerApp {

    /**
     * Node class for singly linked list
     */
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * ============================================================
     * Application Entry Point for UC8
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
        System.out.println("UC8: Linked List Based Palindrome Checker");
        System.out.print("Enter a string: ");

        // --------------------------------------------------------
        // Step 2: Read Input String from User
        // --------------------------------------------------------
        String input = scanner.nextLine();

        // --------------------------------------------------------
        // Step 3: Convert String to Singly Linked List
        // --------------------------------------------------------
        Node head = null;
        Node tail = null;
        for (int i = 0; i < input.length(); i++) {
            Node newNode = new Node(input.charAt(i));
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // --------------------------------------------------------
        // Step 4: Find Middle Node using Fast and Slow Pointers
        // --------------------------------------------------------
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // --------------------------------------------------------
        // Step 5: Reverse Second Half of Linked List
        // --------------------------------------------------------
        Node prev = null;
        Node current = slow;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        Node secondHalfHead = prev; // head of reversed second half

        // --------------------------------------------------------
        // Step 6: Compare First Half and Reversed Second Half
        // --------------------------------------------------------
        Node firstHalfPointer = head;
        Node secondHalfPointer = secondHalfHead;
        boolean isPalindrome = true;

        while (secondHalfPointer != null) {
            if (firstHalfPointer.data != secondHalfPointer.data) {
                isPalindrome = false;
                break;
            }
            firstHalfPointer = firstHalfPointer.next;
            secondHalfPointer = secondHalfPointer.next;
        }

        // --------------------------------------------------------
        // Step 7: Display Result
        // --------------------------------------------------------
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        // --------------------------------------------------------
        // Step 8: Close Scanner Resource
        // --------------------------------------------------------
        scanner.close();
    }
}