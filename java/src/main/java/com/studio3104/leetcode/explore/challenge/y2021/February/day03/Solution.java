package com.studio3104.leetcode.explore.challenge.y2021.February.day03;

import com.studio3104.leetcode.structure.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        do {
            if (slow.next == null) {
                return false;
            }
            slow = slow.next;

            if (fast.next == null || fast.next.next == null) {
                return false;
            }
            fast = fast.next.next;

        } while (slow != fast);

        return true;
    }
}
