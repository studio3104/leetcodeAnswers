package com.studio3104.leetcode.explore.challenge.y2021.January.day12;

import com.studio3104.leetcode.structure.ListNode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pseudo = new ListNode(0);
        ListNode current = pseudo;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;

            current.next = new ListNode(0);
            current = current.next;

            int val = v1 + v2 + current.val + carry;
            carry = val / 10;
            current.val = val % 10;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        if (carry == 1) {
            current.next = new ListNode(1);
        }

        return pseudo.next;
    }
}
