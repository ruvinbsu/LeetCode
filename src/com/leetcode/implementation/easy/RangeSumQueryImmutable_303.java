package com.leetcode.implementation.easy;

/**
 * Created by ruvinyusubov on 25/11/2017.
 */
public class RangeSumQueryImmutable_303 {
    class NumArray {
        int[] sumFromBeginning;

        public NumArray(int[] nums) {

            if (nums.length > 0) {
                sumFromBeginning = new int[nums.length];
                sumFromBeginning[0] = nums[0];

                for (int i = 1; i < nums.length; i++) {
                    sumFromBeginning[i] = sumFromBeginning[i - 1] + nums[i];
                }
            }
        }

        public int sumRange(int i, int j) {
            if (i == 0) {
                return sumFromBeginning[j];
            }
            else {
                return sumFromBeginning[j] - sumFromBeginning[i - 1];
            }
        }
    }
}
