package com.studio3104.leetcode.explore.collection.easy.linkedlist.MergeTwoSortedLists;

import com.studio3104.leetcode.structure.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode result = new ListNode();
        ListNode current = result;
        int v1 = l1.val, v2 = l2.val;

        while (true) {
            if (v1 < v2) {
                current.val = v1;
                l1 = l1.next;
            } else {
                current.val = v2;
                l2 = l2.next;
            }

            v1 = l1 != null ? l1.val : Integer.MAX_VALUE;
            v2 = l2 != null ? l2.val : Integer.MAX_VALUE;
            if (v1 == Integer.MAX_VALUE && v2 == Integer.MAX_VALUE) {
                break;
            } else {
                current.next = new ListNode();
                current = current.next;
            }
        }

        return result;
    }
}
