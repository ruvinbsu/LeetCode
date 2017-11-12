package com.leetcode.greedyalgorithm.easy;

/**
 * Created by ruvinyusubov on 12/11/2017.
 */
public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        int curMaxSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curMaxSum = Math.max(curMaxSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, curMaxSum);
        }
        return maxSum;
    }
}
