package com.leetcode.implementation.easy;

/**
 * Created by ruvinyusubov on 05/11/2017.
 */
public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        int summ = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            summ += nums[i];
        }

        return (len * (len + 1)) / 2 - summ;
    }
}
