package com.studio3104.leetcode.explore.challenge.y2020.November.day02;

import com.studio3104.leetcode.structure.ListNode;

class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode current = head;
        ListNode nextNode;
        ListNode previousNode;
        ListNode temporaryHead = new ListNode();


        while (current != null) {
            previousNode = temporaryHead;
            nextNode = temporaryHead.next;

            while (nextNode != null) {
                if (current.val < nextNode.val) {
                    break;
                }
                previousNode = nextNode;
                nextNode = nextNode.next;
            }

            ListNode temporaryNext = current.next;
            current.next = nextNode;
            previousNode.next = current;
            current = temporaryNext;
        }

        return temporaryHead.next;
    }
}
