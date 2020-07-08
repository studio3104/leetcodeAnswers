package com.studio3104.leetcode.structure;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode createFromArray(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        ListNode current = new ListNode(nums[nums.length - 1]);

        for (int i = nums.length - 2; i >= 0; i--) {
            ListNode parent = new ListNode(nums[i]);
            parent.next = current;
            current = parent;
        }

        return current;
    }
}
