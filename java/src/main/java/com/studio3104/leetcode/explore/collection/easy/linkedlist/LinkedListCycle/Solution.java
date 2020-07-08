package com.studio3104.leetcode.explore.collection.easy.linkedlist.LinkedListCycle;

import com.studio3104.leetcode.structure.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> memo = new HashSet<>();

        while (head != null) {
            if (memo.contains(head)) return true;
            memo.add(head);
            head = head.next;
        }

        return false;
    }
}
