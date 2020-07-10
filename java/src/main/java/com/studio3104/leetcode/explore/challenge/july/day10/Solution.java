package com.studio3104.leetcode.explore.challenge.july.day10;

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

        while (current != null || !stack.isEmpty()) {
            if (current.child == null) {
                if (current.next == null) {
                    if (!stack.isEmpty()) {
                        current.next = stack.pollFirst();
                        current.next.prev = current;
                    } else {
                        break;
                    }
                } else {
                    current = current.next;
                }
                continue;
            }

            if (current.next != null) stack.addFirst(current.next);
            current.child.prev = current;
            current.next = current.child;
            current = current.child;
        }

        Node c = head;
        while (c != null) {
            c.child = null;
            c = c.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.child = new Node(3);

        Node n2 = new Node(1);
        n2.next = new Node(3);
        n2.next.next = new Node(2);

        Solution solution = new Solution();
        solution.flatten(n1);

        System.out.println("n1.val = " + n1.val);
        System.out.println("n2.val = " + n2.val);
        System.out.println();
        System.out.println("n1.next = " + n1.next.val);
        System.out.println("n2.next = " + n2.next.val);
        System.out.println();
        System.out.println("n1.next.next = " + n1.next.next.val);
        System.out.println("n2.next.next = " + n2.next.next.val);
    }
}
