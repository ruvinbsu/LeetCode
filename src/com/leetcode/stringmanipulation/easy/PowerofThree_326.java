package com.leetcode.stringmanipulation.easy;

/**
 * Created by ruvinyusubov on 05/11/2017.
 */
public class PowerofThree_326 {
    public static final double eps = 0.00000000001;
    public boolean isPowerOfThree(int n) {
        if (n <= 0){
            return false;
        }

        double power = Math.log(n) / Math.log(3);

        if ((int) Math.floor(power + eps) == (int) Math.ceil(power)) {
            return true;
        }

        return false;
    }
}