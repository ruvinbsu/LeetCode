package com.leetcode.datastructure.tree.medium;

import java.util.*;

/**
 * Created by ruvinyusubov on 18/11/2017.
 */
public class TopKFrequentElements_347_heap_sol {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> topKFrequentList = new ArrayList<>();
        Map<Integer, Integer> elementFrequency = new HashMap<>();

        for (int arrayEl : nums) {
            elementFrequency.put(arrayEl, elementFrequency.getOrDefault(arrayEl, 0) + 1);
        }

        Set<Integer> keys = elementFrequency.keySet();
        PriorityQueueWithMaxHeap pq = new PriorityQueueWithMaxHeap(keys.size());

        for (Integer key : keys) {
            pq.insertEl(key, elementFrequency.get(key));
        }

        for (int i = 0; i < k; i++) {
            topKFrequentList.add(pq.removeEl().val);
        }

        return topKFrequentList;
    }

    class PriorityQueueWithMaxHeap {
        HeapElement[] heap;
        int numOfElements;

        public PriorityQueueWithMaxHeap(int heapSize) {
            heap = new HeapElement[heapSize + 1];
            numOfElements = 0;
        }

        public void insertEl(int val, int priority) {
            HeapElement heapEl = new HeapElement(val, priority);
            heap[++numOfElements] = heapEl;

            int posToInsert = numOfElements;
            while (posToInsert != 1 && heapEl.priority > heap[posToInsert / 2].priority) {
                heap[posToInsert] = heap[posToInsert / 2];
                posToInsert /= 2;
            }

            heap[posToInsert] = heapEl;
        }

        public HeapElement removeEl() {
            HeapElement removedEl = heap[1];
            HeapElement lowPriorityEl = heap[numOfElements--];
            heap[1] = lowPriorityEl;

            maxHeapify(lowPriorityEl);
            return removedEl;
        }

        private void maxHeapify(HeapElement lowPriorityEl) {
            int rightPositionForEl = 1;
            int childPos = 2;

            while (childPos <= numOfElements) {
                if (childPos < numOfElements && heap[childPos].priority < heap[childPos + 1].priority) {
                    childPos++;
                }

                if (lowPriorityEl.priority >= heap[childPos].priority) {
                    break;
                }

                heap[rightPositionForEl] = heap[childPos];
                rightPositionForEl = childPos;
                childPos *= 2;
            }

            heap[rightPositionForEl] = lowPriorityEl;
        }
    }

    class HeapElement {
        int val;
        int priority;

        public HeapElement(int val, int priority) {
            this.val = val;
            this.priority = priority;
        }
    }
}
