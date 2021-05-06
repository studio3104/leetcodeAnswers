package com.studio3104.leetcode.explore.challenge.y2021.May.day06;

import com.studio3104.leetcode.structure.ListNode;
import com.studio3104.leetcode.structure.TreeNode;

class Solution {
    private ListNode getMiddleElement(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) {
            prev.next = null;
        }

        return slow;
    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode middle = getMiddleElement(head);
        TreeNode node = new TreeNode(middle.val);

        if (head != middle) {
            node.left = sortedListToBST(head);
            node.right = sortedListToBST(middle.next);
        }

        return node;
    }
}
