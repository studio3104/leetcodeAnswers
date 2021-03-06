package com.studio3104.leetcode.explore.challenge.y2020.October.day13;

import com.studio3104.leetcode.structure.ListNode;

class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        int pivot = head.val;
        ListNode current = head.next;
        boolean isSorted = pivot <= current.val;
        ListNode lower = null, greater = null;
        ListNode lowerTail = null, greaterTail = null;

        while (current != null) {
            if (current.next != null && current.val > current.next.val) isSorted = false;

            if (pivot > current.val) {
                if (lower == null) {
                    lower = current;
                    lowerTail = current;
                } else {
                    lowerTail.next = current;
                    lowerTail = lowerTail.next;
                }
            } else {
                if (greater == null) {
                    greater = current;
                    greaterTail = current;
                } else {
                    greaterTail.next = current;
                    greaterTail = greaterTail.next;
                }
            }
            current = current.next;
        }

        if (isSorted) return head;

        if (lowerTail != null) lowerTail.next = null;
        if (greaterTail != null) greaterTail.next = null;
        head.next = sortList(greater);

        lower = sortList(lower);
        if (lower == null) return head;

        ListNode tail = lower;
        while (tail.next != null) tail = tail.next;
        tail.next = head;

        return lower;
    }
}
