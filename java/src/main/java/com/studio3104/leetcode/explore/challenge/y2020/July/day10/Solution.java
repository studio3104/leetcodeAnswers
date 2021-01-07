package com.studio3104.leetcode.explore.challenge.y2020.July.day10;

import java.util.ArrayDeque;
import java.util.Deque;

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    public Node(int val) { this.val = val; }
}

class Solution {
    public Node flatten(Node head) {
        Node current = head;
        Deque<Node> stack = new ArrayDeque<>();

        while (current != null) {
            if (current.child == null && current.next == null && stack.isEmpty()) break;

            if (current.child == null) {
                if (current.next == null) {
                    current.next = stack.pollFirst();
                    current.next.prev = current;
                } else {
                    current = current.next;
                }
            } else {
                if (current.next != null) stack.addFirst(current.next);
                current.child.prev = current;
                current.next = current.child;
                current = current.child;
                current.prev.child = null;
            }
        }

        return head;
    }
}
