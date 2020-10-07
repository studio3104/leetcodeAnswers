package com.studio3104.leetcode.explore.challenge.October.day07;

import com.studio3104.leetcode.structure.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        List<ListNode> nodes = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            nodes.add(current);
            current = current.next;
        }

        int length = nodes.size();
        if (k % length == 0) return head;

        int endIndex = length - 1 - k % length;
        nodes.get(endIndex).next = null;
        nodes.get(length - 1).next = head;

        return nodes.get(endIndex + 1);
    }
}
