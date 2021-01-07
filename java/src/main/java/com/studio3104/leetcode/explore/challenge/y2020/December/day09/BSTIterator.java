package com.studio3104.leetcode.explore.challenge.y2020.December.day09;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

// Implement to meet the follow up condition
// Follow up: Could you implement next() and hasNext() to run in average O(1) time and use O(h) memory, where h is the height of the tree?
class BSTIterator {
    private final Deque<TreeNode> stack;

    private void insertLeftToStack(TreeNode node) {
        TreeNode current = node;
        while (current != null) {
            stack.addLast(current);
            current = current.left;
        }
    }

    public BSTIterator(TreeNode root) {
        stack = new ArrayDeque<>();
        insertLeftToStack(root);
    }

    public int next() {
        if (stack.isEmpty()) throw new RuntimeException();

        TreeNode node = stack.pollLast();
        insertLeftToStack(node.right);
        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
