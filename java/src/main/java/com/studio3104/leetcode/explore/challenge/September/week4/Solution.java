package com.studio3104.leetcode.explore.challenge.September.week4;

class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
}

public class Solution {
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            Node n = new Node(insertVal);
            n.next = n;
            return n;
        }

        Node current = head;
        boolean inserted = false;

        while (current.next != null) {
            if (current.val <= insertVal && current.next.val >= insertVal) {
                inserted = true;
                current.next = new Node(insertVal, current.next);
                current = current.next;
            }
            current = current.next;
        }

        if (!inserted) current.next = new Node(insertVal, head);
        else current.next = head;

        return head;
    }
}
