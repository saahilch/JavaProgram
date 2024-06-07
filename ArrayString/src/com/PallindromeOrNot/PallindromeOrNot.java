package com.PallindromeOrNot;

import java.util.Scanner;

class PallindromeOrNot {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        long reversed = 0;
        int y = x;

        while (y > 0) {
            reversed = reversed * 10 + y % 10;
            y /= 10;
        }

        return reversed == x;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        // Input validation
        while (!scanner.hasNextInt()) { 
            System.out.println("Invalid input. Please enter an integer:");
            scanner.next(); // Clear the invalid input
        }

        int input = scanner.nextInt();
        PallindromeOrNot solution = new PallindromeOrNot();
        boolean isPal = solution.isPalindrome(input);

        if (isPal) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }
}



