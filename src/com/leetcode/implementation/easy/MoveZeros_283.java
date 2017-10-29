package com.leetcode.implementation.easy;

/**
 * Created by ruvinyusubov on 29/10/2017.
 */
public class MoveZeros_283 {
    public void moveZeroes(int[] nums) {
        int numOfZeros = 0;
        int posOfZero = -1;
        int ind = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                numOfZeros++;
            }
        }

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[ind++] = nums[i];
            }
        }

        for (int i = 0; i < numOfZeros; i++){
            nums[(nums.length - 1) - i] = 0;
        }
    }
}
