package com.leetcode.datastructure.tree.medium;

import java.util.*;

/**
 * Created by ruvinyusubov on 19/11/2017.
 */
public class LowestCommonAncestorofaBinaryTree_236 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        MyTreeNode myP;
        MyTreeNode myQ;

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            MyTreeNode myRoot = new MyTreeNode(root);
            determineParents(myRoot, p, q);

            int lenP = 1;
            int lenQ = 1;
            MyTreeNode pp = myP;
            MyTreeNode qq = myQ;

            while (pp.parent != null || qq.parent != null) {
                if (pp.parent != null) {
                    lenP++;
                    pp = pp.parent;
                }
                if (qq.parent != null) {
                    lenQ++;
                    qq = qq.parent;
                }
            }

            while (lenP != lenQ) {
                if (lenP > lenQ) {
                    myP = myP.parent;
                    lenP--;
                }
                else {
                    myQ = myQ.parent;
                    lenQ--;
                }
            }

            while (lenP > 0) {
                if (myP.node == myQ.node) {
                    return myP.node;
                }

                myP = myP.parent;
                myQ = myQ.parent;
                lenP--;
            }

            return null;
        }

        public void determineParents(MyTreeNode myNode, TreeNode p, TreeNode q) {
            if (myNode.node != null) {
                if (myNode.node == p) {
                    myP = myNode;
                }
                if (myNode.node == q) {
                    myQ = myNode;
                }

                TreeNode left = myNode.node.left;
                TreeNode right = myNode.node.right;
                MyTreeNode myLeft = new MyTreeNode(left);
                MyTreeNode myRight = new MyTreeNode(right);

                if (left != null) {
                    myLeft.parent = myNode;
                    determineParents(myLeft, p, q);
                }

                if (right != null) {
                    myRight.parent = myNode;
                    determineParents(myRight, p, q);
                }
            }
        }

        class MyTreeNode {
            TreeNode node;
            public MyTreeNode parent;

            MyTreeNode(TreeNode node) {
                this.node=node;
            }
        }
    }
}
