package com.studio3104.leetcode.explore.collection.medium.LinkedList.IntersectionOfTwoLinkedList;

import com.studio3104.leetcode.structure.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> setA = new HashSet<>();

        while (headA != null) {
            setA.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (setA.contains(headB)) return headB;
            headB = headB.next;
        }

        return null;
    }
}
