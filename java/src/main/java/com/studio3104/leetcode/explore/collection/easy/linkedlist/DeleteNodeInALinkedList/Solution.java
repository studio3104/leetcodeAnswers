package com.studio3104.leetcode.explore.collection.easy.linkedlist.DeleteNodeInALinkedList;

import com.studio3104.leetcode.structure.ListNode;

public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
