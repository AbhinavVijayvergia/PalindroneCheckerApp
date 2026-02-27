import java.util.Scanner;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC3: Palindrome Check Using String Reverse ===");
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Reverse string using for loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String concatenation
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}