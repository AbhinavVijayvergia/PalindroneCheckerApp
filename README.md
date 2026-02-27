# Palindrome Checker App (Java)

## Project Overview

The Palindrome Checker App is a Java console-based application developed incrementally through multiple use cases (UC1–UC5). The application demonstrates different approaches to checking whether a given string is a palindrome.

A palindrome is a word, phrase, number, or sequence that reads the same backward as forward.

Examples:
- madam
- racecar
- level

---

## Learning Objectives

This project demonstrates:

- Java application structure
- Console input and output
- String manipulation
- Character arrays
- Stack data structure
- Incremental development using use cases

---

## Use Case Breakdown

### UC1 – Application Entry & Welcome Message
- Create the main class.
- Display a welcome message to the user.

### UC2 – Print a Hardcoded Palindrome Result
- Check a hardcoded string.
- Print whether it is a palindrome.

### UC3 – Palindrome Check Using String Reverse
- Reverse the string using built-in methods.
- Compare original and reversed strings.

### UC4 – Character Array Based Palindrome Check
- Convert the string to a character array.
- Compare characters from start and end using a loop.

### UC5 – Stack-Based Palindrome Checker
- Use a Stack data structure.
- Push characters onto the stack.
- Pop characters and compare with the original string.
- Determine if the string is a palindrome.

---

## Technologies Used

- Java (JDK 8 or above)
- Java Collections Framework (Stack)
- Console-based application

---

## How to Compile and Run

### Compile
javac PalindromeChecker.java

### Run
java PalindromeChecker

---

## Example Output

Welcome to the Palindrome Checker App!

Enter a word:
madam

Result: madam is a Palindrome.

---

## Project Structure

PalindromeChecker/
│
├── PalindromeChecker.java
└── README.md

---

## Future Enhancements

- Case-insensitive palindrome checking
- Ignore spaces and punctuation
- GUI version of the application
- Unit testing support

---

## Author

Developed as part of coursework:
"01 Palindrome Checker App"
