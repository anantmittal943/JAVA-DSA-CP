package com.anantmittal.dsa_cp.Leetcode;

public class Palindrome_Number_9 {
    static boolean palindrome(int n) {
        int revNum = 0;
        int dup = n;
        while (n > 0) {
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n / 10;
        }
        return dup == revNum;
    }

    public static void main(String[] args) {
        int number = 4554;

        if (palindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}

/*

class Solution {

     * Checks if an integer is a palindrome using an optimized approach
     * that reverses only half the number to avoid integer overflow.
     * @param x The integer to check.
     * @return true if x is a palindrome, false otherwise.

    public boolean isPalindrome(int x) {
        // Edge Case:
        // If x is negative, it's not a palindrome.
        // Also, if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0. Only 0 satisfies this property.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the loop ends, x has the first half and revertedNumber has the second half.
        // For numbers with an odd number of digits (e.g., 12321), the middle digit (3)
        // will be the last digit of revertedNumber. We can simply remove it by division.
        // For example, at the end of the loop: x = 12, revertedNumber = 123.
        // So, we check x == revertedNumber / 10.
        // For numbers with an even number of digits (e.g., 1221), x will be equal to revertedNumber.
        // For example, at the end of the loop: x = 12, revertedNumber = 12.
        return x == revertedNumber || x == revertedNumber / 10;
    }
}

*/