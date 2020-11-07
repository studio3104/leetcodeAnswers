package com.studio3104.leetcode.explore.challenge.November.day07;

import com.studio3104.leetcode.structure.ListNode;

class Solution {
    private long convertToInt(ListNode listNode) {
        ListNode current = listNode;
        long num = 0;

        while (current != null) {
            num = num * 10 + current.val;
            current = current.next;
        }

        return num;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long num = convertToInt(l1) + convertToInt(l2);
        if (num == 0) return new ListNode(0);
        int digits = (int) Math.pow(10, Math.floor(Math.log10(num)));

        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        for (int i = digits; i >= 1; i /= 10) {
            int quotient = (int) (num / i);
            num = num % i;

            current.next = new ListNode(quotient);
            current = current.next;
        }

        return dummyHead.next;
    }
}
