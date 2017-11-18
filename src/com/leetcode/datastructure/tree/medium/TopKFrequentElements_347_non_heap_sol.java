package com.leetcode.datastructure.tree.medium;

import java.util.*;

/**
 * Created by ruvinyusubov on 18/11/2017.
 */
public class TopKFrequentElements_347_non_heap_sol {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> elementFrequency = new HashMap<>();
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> topKFrequentList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            Integer elFreq = elementFrequency.get(nums[i]);
            if (elFreq != null) {
                elementFrequency.put(nums[i], elFreq + 1);
            }
            else {
                elementFrequency.put(nums[i], 1);
            }

            uniqueElements.add(nums[i]);
        }

        for (int i = 0; i < k; i++) {
            int maxFreq = -1;
            Integer currMaxEl = -1;
            for (Integer el : uniqueElements) {
                int elFreq = elementFrequency.get(el);
                if (elFreq > maxFreq) {
                    maxFreq = elFreq;
                    currMaxEl = el;
                }
            }
            topKFrequentList.add(currMaxEl);
            uniqueElements.remove(currMaxEl);
        }

        return topKFrequentList;
    }
}
