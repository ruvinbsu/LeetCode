package com.leetcode.datastructure.linkedlist.easy;

/**
 * Created by ruvinyusubov on 18/11/2017.
 */
public class IntersectionofTwoLinkedLists_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;
        int lenA = 1;
        int lenB = 1;

        while (a.next != null || b.next != null) {
            if (a.next != null) {
                lenA++;
                a = a.next;
            }
            if (b.next != null) {
                lenB++;
                b = b.next;
            }
        }

        while (lenA != lenB) {
            if (lenA > lenB) {
                headA = headA.next;
                lenA--;
            }
            else {
                headB = headB.next;
                lenB--;
            }
        }

        while (lenB > 0) {
            if (headA == headB) {
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
            lenB--;
        }

        return null;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
