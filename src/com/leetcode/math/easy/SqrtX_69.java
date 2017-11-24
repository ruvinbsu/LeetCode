package com.leetcode.math.easy;

/**
 * Created by ruvinyusubov on 24/11/2017.
 */
public class SqrtX_69 {
    public int mySqrt(int x) {
        int i = 1;
        while (i * i < x && i * i > 0) {
            i++;
        }

        if (i * i > x || i * i <= 0) {
            return i - 1;
        }

        return i;
    }
}
