package com.studio3104.leetcode.explore.challenge.December.day09;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

class BSTIterator {
    private final Deque<Integer> q;

    private void setQueueInOrder(TreeNode node) {
        if (node == null) return;
        setQueueInOrder(node.left);
        q.addLast(node.val);
        setQueueInOrder(node.right);
    }

    public BSTIterator(TreeNode root) {
        q = new ArrayDeque<>();
        setQueueInOrder(root);
    }

    public int next() {
        if (q.isEmpty()) throw new RuntimeException();
        return q.pollFirst();
    }

    public boolean hasNext() {
        return !q.isEmpty();
    }
}
