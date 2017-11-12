package com.leetcode.datastructure.tree.easy;

import java.util.ArrayList;

/**
 * Created by ruvinyusubov on 12/11/2017.
 */
public class SymmetricTree_101 {
    public boolean isTreeSymmetric = true;
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        ArrayList<TreeNode> elementsOfLevel = new ArrayList<>();
        elementsOfLevel.add(root.left);
        elementsOfLevel.add(root.right);
        checkForSymmetry(elementsOfLevel);
        return isTreeSymmetric;
    }

    public void checkForSymmetry(ArrayList<TreeNode> elements) {
        if (isTreeSymmetric) {
            boolean allNodesNull = true;
            ArrayList<TreeNode> elementsOfNextLevel = new ArrayList<>();
            for (int i = 0; i < elements.size(); i++) {
                TreeNode node1 = elements.get(i);
                TreeNode node2 = elements.get(elements.size() - i - 1);
                int el1 = -1000 * 1000 * 1000;
                int el2 = -1000 * 1000 * 1000;

                if (node1 != null) {
                    allNodesNull = false;
                    el1 = node1.val;
                    elementsOfNextLevel.add(node1.left);
                    elementsOfNextLevel.add(node1.right);
                }
                else {
                    elementsOfNextLevel.add(null);
                    elementsOfNextLevel.add(null);
                }

                if (node2 != null) {
                    el2 = node2.val;
                }

                if (el1 != el2) {
                    isTreeSymmetric = false;
                    return;
                }

            }

            if (allNodesNull) {
                return;
            }
            checkForSymmetry(elementsOfNextLevel);
        }
    }

    class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
