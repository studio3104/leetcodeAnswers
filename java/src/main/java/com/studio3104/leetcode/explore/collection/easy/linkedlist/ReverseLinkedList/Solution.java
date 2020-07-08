package com.studio3104.leetcode.explore.collection.easy.linkedlist.ReverseLinkedList;

import com.studio3104.leetcode.structure.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode temporary = current.next;
            current.next = previous;
            previous = current;
            current = temporary;
        }

        return previous;
    }
}
