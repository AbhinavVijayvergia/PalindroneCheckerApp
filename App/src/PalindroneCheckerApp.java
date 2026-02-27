public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String word = "madam";

        System.out.println("===== Palindrome Checker App =====");
        System.out.println("UC2: Print a Hardcoded Palindrome Result");
        System.out.println("Hardcoded String: " + word);

        // Check palindrome using simple reverse logic
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Conditional statement (if-else)
        if (word.equals(reversed)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("Program exited successfully.");
    }
}