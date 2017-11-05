package com.leetcode.datastructure.linkedlist.easy;

/**
 * Created by ruvinyusubov on 05/11/2017.
 */
public class ReverseLinkedList_206 {
    ListNode newHead = null;

    public ListNode reverseList(ListNode head) {
        if (head != null) {
            updateItemDirection(head, head.next);
            head.next = null;
        }

        return newHead;
    }

    public void updateItemDirection(ListNode node, ListNode nextNode) {
        if (node != null && nextNode != null) {
            ListNode copyNextNextNode = nextNode.next;
            nextNode.next = node;
            updateItemDirection(nextNode, copyNextNextNode);
        }

        if (nextNode == null) {
            newHead = node;
        }
    }

    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
