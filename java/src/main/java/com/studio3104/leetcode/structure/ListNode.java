package com.studio3104.leetcode.structure;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }

    public static ListNode createFromArray(int[] nums) {
        ListNode current = new ListNode(nums[nums.length - 1]);

        for (int i = nums.length - 2; i >= 0; i--) {
            ListNode parent = new ListNode(nums[i]);
            parent.next = current;
            current = parent;
        }

        return current;
    }
}
