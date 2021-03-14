package com.studio3104.leetcode.explore.challenge.y2021.March.day14;

import com.studio3104.leetcode.structure.ListNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        List<ListNode> l = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            l.add(current);
            current = current.next;
        }

        ListNode a = l.get(k - 1);
        l.set(k - 1, l.get(l.size() - k));
        l.set(l.size() - k, a);

        ListNode pseudo = new ListNode();
        current = pseudo;
        for (ListNode n : l) {
            current.next = n;
            current = n;
        }
        current.next = null;

        return pseudo.next;
    }
}
