package com.leetcode.implementation.easy;

import java.util.Arrays;

/**
 * Created by ruvinyusubov on 29/10/2017.
 */
public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        int numOfReqAppearences = (int) (Math.floor(nums.length / 2.0));
        int numOfActualAppearences = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]){
                if (numOfActualAppearences > numOfReqAppearences){
                    return nums[i - 1];
                }

                numOfActualAppearences = 1;
            }
            else {
                numOfActualAppearences++;
            }
        }

        return nums[nums.length - 1];
    }
}
