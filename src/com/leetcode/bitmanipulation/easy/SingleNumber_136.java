package com.leetcode.bitmanipulation.easy;

/**
 * Created by ruvinyusubov on 22/10/2017.
 */
public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            res ^= nums[i];
        }

        return res;
    }
}
