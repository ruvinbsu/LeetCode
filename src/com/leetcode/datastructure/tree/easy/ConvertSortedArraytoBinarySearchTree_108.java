package com.leetcode.datastructure.tree.easy;

import java.util.Arrays;

/**
 * Created by ruvinyusubov on 11/11/2017.
 */
public class ConvertSortedArraytoBinarySearchTree_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        int lenOfArray = nums.length / 2;
        TreeNode node = new TreeNode(nums[lenOfArray]);

        if (lenOfArray - 1 >= 0) {
            node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, lenOfArray));
        }

        if (nums.length - lenOfArray + 1 >= 0) {
            node.right = sortedArrayToBST(Arrays.copyOfRange(nums, lenOfArray + 1, nums.length));
        }

        return node;
    }

    class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
