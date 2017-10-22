package com.leetcode.bitmanipulation.easy;

/**
 * Created by ruvinyusubov on 22/10/2017.
 */
public class SumOfTwoIntegers_371 {
    public int getSum(int a, int b) {
        if (b == 0){
            return a;
        }
        else{
            return getSum(a ^ b, (a & b) << 1);
        }
    }
}
