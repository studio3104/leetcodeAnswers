package com.studio3104.leetcode.explore.challenge.November.day07;

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(null, l1);
        l2 = reverseList(null, l2);

        int carry = 0;
        ListNode current = null;

        while (l1 != null || l2 != null) {
            int n1 = 0, n2 = 0;

            if (l1 != null) {
                n1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                n2 = l2.val;
                l2 = l2.next;
            }

            int sum = n1 + n2 + carry;
            carry = sum / 10;
            ListNode listNode = new ListNode(sum % 10);
            listNode.next = current;
            current = listNode;
        }

        return carry == 0 ? current : new ListNode(1, current);
    }
}
