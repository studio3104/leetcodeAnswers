package com.studio3104.leetcode.explore.challenge.y2020.November.day01;

import com.studio3104.leetcode.structure.ListNode;

class Solution {
    public int getDecimalValue(ListNode head) {
        int n = head.val;
        while (head.next != null) {
            n = (n << 1) | head.next.val;
            head = head.next;
        }
        return n;
    }
}
