package com.leetcode.datastructure.set.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ruvinyusubov on 05/11/2017.
 */
public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueElems = new HashSet<>();
        int size = 0;
        for (int i = 0; i < nums.length; i++){
            size = uniqueElems.size();
            uniqueElems.add(nums[i]);
            if (size == uniqueElems.size()){
                return true;
            }
        }

        return false;
    }
}
