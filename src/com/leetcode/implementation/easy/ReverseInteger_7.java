package com.leetcode.implementation.easy;

/**
 * Created by ruvinyusubov on 24/11/2017.
 */
public class ReverseInteger_7 {
    public int reverse(int x) {
        int sign = 1;
        int reverseNumber = 0;
        int copyX = x;
        int lenX = 0;

        if (copyX < 0) {
            sign = -1;
            copyX *= -1;
        }

        while (copyX != 0) {
            reverseNumber = reverseNumber * 10 + copyX % 10;
            copyX /= 10;
            lenX++;
        }

        int copyReverseNumber = reverseNumber;
        int newX = 0;
        int lenNewX = 0;

        while (copyReverseNumber != 0) {
            newX = newX * 10 + copyReverseNumber % 10;
            copyReverseNumber /= 10;
            lenNewX++;
        }

        if (x != newX * sign * (int) Math.pow(10, (lenX - lenNewX))) {
            reverseNumber = 0;
        }

        return sign * reverseNumber;
    }
}
