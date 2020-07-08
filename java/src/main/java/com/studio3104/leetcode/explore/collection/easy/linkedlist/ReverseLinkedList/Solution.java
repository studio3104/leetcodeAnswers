package com.studio3104.leetcode.explore.collection.easy.linkedlist.ReverseLinkedList;

import com.studio3104.leetcode.structure.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode answer = new ListNode(head.val);
        ListNode current = head;

        while (current.next != null) {
            answer = new ListNode(current.next.val, answer);
            current = current.next;
        }

        return answer;
    }
}
