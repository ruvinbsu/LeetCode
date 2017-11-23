package com.leetcode.datastructure.linkedlist.easy;

/**
 * Created by ruvinyusubov on 23/11/2017.
 */
public class PalindromeLinkedList_234 {
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        if (head == null) {
            return true;
        }

        ListNode headCopy = head;

        while (headCopy != null) {
            headCopy = headCopy.next;
            len++;
        }

        // if linked list is a palindrome then starting position of matching chars should be
        // (len + 1) / 2 + 1
        int rightStartPos = (len + 1) / 2 + 1;
        ListNode rightStartPosEl = reverseHalfLinkedList(head, rightStartPos, len);

        while (head != null && rightStartPosEl != null && head.val == rightStartPosEl.val) {
            head = head.next;
            rightStartPosEl = rightStartPosEl.next;
        }

        if (head == null || rightStartPosEl == null) {
            return true;
        }

        return false;
    }

    public ListNode reverseHalfLinkedList(ListNode head, int startPos, int endPos) {
        if (head.next == null) {
            return head;
        }

        ListNode headCopy = head;
        int len = 1;

        while (len < startPos) {
            headCopy = headCopy.next;
            len++;
        }
        if (headCopy.next == null) {
            return headCopy;
        }

        ListNode consideringEl = headCopy.next;
        ListNode previousEl = headCopy;
        headCopy.next = null;

        while (consideringEl != null) {
            ListNode nextNext = consideringEl.next;
            consideringEl.next = previousEl;
            previousEl = consideringEl;
            consideringEl = nextNext;
        }

        return previousEl;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
