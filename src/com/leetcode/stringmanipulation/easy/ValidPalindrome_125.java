package com.leetcode.stringmanipulation.easy;

/**
 * Created by ruvinyusubov on 24/11/2017.
 */
public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while (left < right) {
            if (!isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            else if (!isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            else if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            else {
                left++;
                right--;
            }

        }
        return true;
    }

    boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
