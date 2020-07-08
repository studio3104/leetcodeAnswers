package com.studio3104.leetcode.explore.collection.easy.linkedlist.PalindromeLinkedList;

import com.studio3104.leetcode.structure.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
    Finding any O(1) space solution was not easy for me...
    Gonna retry someday probably...
     */
    public boolean isPalindrome(ListNode head) {
        List<Integer> memo = new ArrayList<>();

        while (head != null) {
            memo.add(head.val);
            head = head.next;
        }

        int i = 0, j = memo.size() - 1;
        while (i < j) {
            if (!memo.get(i++).equals(memo.get(j--))) return false;
        }

        return true;
    }
}
