package com.leetcode.datastructure.tree.medium;

/**
 * Created by ruvinyusubov on 02/12/2017.
 */
public class PopulatingNextRightPointersinEachNode_116 {
    public void connect(TreeLinkNode root) {

        TreeLinkNode parent = null;
        TreeLinkNode nextOfParent = null;

        populateNextPointer(root, parent, nextOfParent);
    }

    public void populateNextPointer(TreeLinkNode currentNode, TreeLinkNode parentNode, TreeLinkNode nextOfParentNode) {
        if (currentNode != null && parentNode != null) {
            if (currentNode != parentNode.right) {
                currentNode.next = parentNode.right;
            }
            else if (nextOfParentNode != null) {
                currentNode.next = nextOfParentNode.left;
            }
        }

        if (currentNode != null) {
            populateNextPointer(currentNode.left, currentNode, currentNode.next);
            populateNextPointer(currentNode.right, currentNode, currentNode.next);
        }
    }

    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) { val = x; }
    }
}
