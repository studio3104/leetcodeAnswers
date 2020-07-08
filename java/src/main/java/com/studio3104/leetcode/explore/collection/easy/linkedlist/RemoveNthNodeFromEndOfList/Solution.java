package com.studio3104.leetcode.explore.collection.easy.linkedlist.RemoveNthNodeFromEndOfList;

import com.studio3104.leetcode.structure.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
    This is actually a one pass solution.
    However this solution has O(N) space complexity, but it should be able to be O(1).
    Retry someday...
    */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> indexes = new ArrayList<>();

        ListNode current = head;
        while (current != null) {
            indexes.add(current);
            current = current.next;
        }

        if (indexes.size() == n) return head.next;

        ListNode target = indexes.get(indexes.size() - n - 1);
        target.next = n == 1 ? null : indexes.get(indexes.size() - n + 1);

        return head;
    }
}
