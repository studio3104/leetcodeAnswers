package com.studio3104.leetcode.explore.Learn.Recursion.I.RecurrenceRelation.ReverseLinkedList;

import com.studio3104.leetcode.structure.ListNode;

class Solution {
    private ListNode reverseList(ListNode head, ListNode nextHead) {
        if (nextHead == null) {
            return head;
        }

        ListNode nextNextHead = nextHead.next;
        nextHead.next = head;

        return reverseList(nextHead, nextNextHead);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        return reverseList(null, head);
    }
}
