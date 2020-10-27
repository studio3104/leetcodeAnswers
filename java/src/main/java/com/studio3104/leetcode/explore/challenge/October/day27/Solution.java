package com.studio3104.leetcode.explore.challenge.October.day27;

import com.studio3104.leetcode.structure.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }

        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (slow != fast) {
            if (slow.next == null) {
                return null;
            }
            slow = slow.next;

            if (fast.next == null || fast.next.next == null) {
                return null;
            }
            fast = fast.next.next;
        }

        ListNode l1 = head;
        ListNode l2 = slow;

        while (l1 != l2) {
            l1 = l1.next;
            l2 = l2.next;
        }

        return l1;
    }
}
