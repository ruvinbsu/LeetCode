package com.leetcode.math.easy;

/**
 * Created by ruvinyusubov on 12/11/2017.
 */
public class HappyNumber_202 {
    public boolean isHappy(int n) {
        int x = n;
        do {
            n = getSumOfDigitSquares(n);
            x = getSumOfDigitSquares(x);
            x = getSumOfDigitSquares(x);
        } while (n != x);

        return x == 1;
    }

    public int getSumOfDigitSquares(int x) {
        int res = 0;
        while (x > 0) {
            res += (x % 10) * (x % 10);
            x /= 10;
        }
        return res;
    }
}
