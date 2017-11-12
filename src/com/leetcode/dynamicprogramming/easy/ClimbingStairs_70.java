package com.leetcode.dynamicprogramming.easy;

/**
 * Created by ruvinyusubov on 12/11/2017.
 */
public class ClimbingStairs_70 {
    public int climbStairs(int n) {
        int[] res = new int[1000];
        res[0] = 0; res[1] = 1; res[2] = 2;

        for (int i = 3; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }

        return res[n];
    }
}
