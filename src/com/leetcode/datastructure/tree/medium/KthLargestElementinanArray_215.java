package com.leetcode.datastructure.tree.medium;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by ruvinyusubov on 30/11/2017.
 */
public class KthLargestElementinanArray_215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length, new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                return o2 - o1;
            }
        });

        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }

        for (int i = 0; i < k - 1; i++) {
            pq.remove(pq.peek());
        }

        return pq.peek();
    }
}
