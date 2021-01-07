package com.studio3104.leetcode.explore.challenge.y2020.December.week3;

import com.studio3104.leetcode.structure.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public ListNode plusOne(ListNode head) {
        Deque<ListNode> q = new ArrayDeque<>();
        ListNode current = head;

        while (current != null) {
            q.add(current);
            current = current.next;
        }

        while (!q.isEmpty()) {
            current = q.pollLast();
            current.val += 1;

            if (current.val < 10) {
                return head;
            }

            current.val %= 10;
        }

        return new ListNode(1, head);
    }
}
