package com.studio3104.leetcode.explore.challenge.y2021.April.day01;

import com.studio3104.leetcode.structure.ListNode;

class Solution {
    private ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode temporary = head.next;
            current.next = previous;
            previous = current;
            current = temporary;
        }

        return previous;
    }

    private ListNode findTailOfFirstHalf(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode tailOfFirstHalf = findTailOfFirstHalf(head);
        ListNode l1 = reverseList(tailOfFirstHalf.next);
        ListNode l2 = head;

        while (l1 != null) {
            if (l1.val != l2.val) {
                return false;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        return true;
    }
}
