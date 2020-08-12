package com.studio3104.leetcode.explore.collection.medium.LinkedList.OddEvenLinkedList;

import com.studio3104.leetcode.structure.ListNode;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }
}
