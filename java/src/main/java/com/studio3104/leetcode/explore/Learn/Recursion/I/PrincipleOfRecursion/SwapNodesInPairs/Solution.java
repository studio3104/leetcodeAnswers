package com.studio3104.leetcode.explore.Learn.Recursion.I.PrincipleOfRecursion.SwapNodesInPairs;

import com.studio3104.leetcode.structure.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if ((head == null) || (head.next == null)) {
            return head;
        }

        ListNode followNode = head.next;

        head.next  = swapPairs(followNode.next);
        followNode.next = head;

        return followNode;
    }
}
