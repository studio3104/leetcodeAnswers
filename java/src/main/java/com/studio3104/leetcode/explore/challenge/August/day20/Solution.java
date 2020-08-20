package com.studio3104.leetcode.explore.challenge.August.day20;

import com.studio3104.leetcode.structure.ListNode;

import java.util.LinkedList;

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null) return;

        LinkedList<ListNode> nodes = new LinkedList<>();

        ListNode node = head.next;
        while (node != null) {
            nodes.add(node);
            node = node.next;
        }

        node = head;
        boolean nextIsLast = true;
        while (!nodes.isEmpty()) {
            node.next = nextIsLast ? nodes.pollLast() : nodes.pollFirst();
            node = node.next;
            nextIsLast = !nextIsLast;
        }
        node.next = null;
    }
}
