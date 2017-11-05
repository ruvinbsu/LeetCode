package com.leetcode.datastructure.list.easy;

/**
 * Created by ruvinyusubov on 04/11/2017.
 */
public class DeleteNodeinaLinkedList_237 {
    public void deleteNode(ListNode node) {
        if (node.next != null){
            node.val = node.next.val;
            if (node.next.next != null){
                node.next = node.next.next;
            }
            else{
                node.next = null;
            }
        }
    }
}


// Definition for singly-linked list.
class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
