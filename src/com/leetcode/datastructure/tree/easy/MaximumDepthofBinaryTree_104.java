package com.leetcode.datastructure.tree.easy;

/**
 * Created by ruvinyusubov on 22/10/2017.
 */
public class MaximumDepthofBinaryTree_104 {
    public int maxx = 0;

    public int maxDepth(TreeNode root) {
        inOrderTraversal(root, 1);
        return maxx;
    }

    public void inOrderTraversal(TreeNode node, int curr)
    {
        if (node == null)
            return;

        if (node.left == null && node.right == null && curr > maxx){
            maxx = curr;
        }

        inOrderTraversal(node.left, curr + 1);
        inOrderTraversal(node.right, curr + 1);
    }

    class TreeNode {
        public TreeNode left;
        public TreeNode right;
    }
}