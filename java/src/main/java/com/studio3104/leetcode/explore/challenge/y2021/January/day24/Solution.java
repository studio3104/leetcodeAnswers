package com.studio3104.leetcode.explore.challenge.y2021.January.day24;

import com.studio3104.leetcode.structure.ListNode;

import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (ListNode l : lists) {
            while (l != null) {
                heap.add(l.val);
                l = l.next;
            }
        }

        ListNode pseudo = new ListNode();
        ListNode current = pseudo;

        while (!heap.isEmpty()) {
            current.next = new ListNode(heap.poll());
            current = current.next;
        }

        return pseudo.next;
    }
}
