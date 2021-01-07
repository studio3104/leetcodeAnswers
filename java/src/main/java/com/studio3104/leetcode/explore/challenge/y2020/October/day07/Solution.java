package com.studio3104.leetcode.explore.challenge.y2020.October.day07;

import com.studio3104.leetcode.structure.ListNode;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int length = 0;
        ListNode currentEnd = head;

        while (currentEnd.next != null) {
            ++length;
            currentEnd = currentEnd.next;
        }
        ++length;
        currentEnd.next = head;

        ListNode newEnd = head;
        for (int i = 0; i < length - 1 - k % length; ++i) newEnd = newEnd.next;
        ListNode newHead = newEnd.next;
        newEnd.next = null;

        return newHead;
    }
}
