package com.studio3104.leetcode.explore.challenge.y2020.December.day02;

import com.studio3104.leetcode.structure.ListNode;

// Space complexity: O(1)
class Solution {
    private final ListNode head;

    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        int value = 0;
        ListNode current = head;

        for (int i = 1; current != null; ++i) {
            if (Math.random() < 1.0 / i) value = current.val;
            current = current.next;
        }

        return value;
    }
}
