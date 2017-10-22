package com.leetcode.implementation.easy;

import java.util.*;

/**
 * Created by ruvinyusubov on 22/10/2017.
 */
public class FizzBuzz_412 {
    public List<String> fizzBuzz(int n) {
        List<String> resList = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (i % 15 == 0){
                resList.add("FizzBuzz");
            }
            else if (i % 5 == 0){
                resList.add("Buzz");
            }
            else if (i % 3 == 0){
                resList.add("Fizz");
            }
            else resList.add("" + i);
        }
        return resList;
    }
}
