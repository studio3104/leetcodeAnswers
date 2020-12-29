package com.studio3104.leetcode.Problems.p0083RemoveDuplicatesFromSortedList;

import com.studio3104.leetcode.structure.ListNode;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode previous = head;
        ListNode current = head;

        while (current != null) {
            if (previous.val != current.val) {
                previous.next = current;
                previous = previous.next;
            }
            current = current.next;
        }

        if (previous != null) {
            previous.next = null;
        }

        return head;
    }
}
