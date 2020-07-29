package com.studio3104.leetcode.explore.collection.medium.LinkedList.AddTwoNumbers;

import com.studio3104.leetcode.structure.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean toCarry = false;
        ListNode result = new ListNode();
        ListNode current = result;

        while (l1 != null || l2 != null) {
            int a = 0, b = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }

            int sum = toCarry ? 1 + a + b : a + b;
            toCarry = sum >= 10;

            current.next = new ListNode();
            current = current.next;
            current.val = sum % 10;
        }

        current.next = toCarry ? new ListNode(1) : null;
        return result.next;
    }
}
