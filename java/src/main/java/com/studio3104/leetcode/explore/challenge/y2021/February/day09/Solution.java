package com.studio3104.leetcode.explore.challenge.y2021.February.day09;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    private void enqueue(TreeNode node, Deque<TreeNode> q) {
        if (node == null) {
            return;
        }

        enqueue(node.right, q);
        q.add(node);
        enqueue(node.left, q);
    }

    public TreeNode convertBST(TreeNode root) {
        // Traverse in-order (right, root, left), add each element into a queue
        Deque<TreeNode> q = new ArrayDeque<>();
        enqueue(root, q);

        // Pop each element from the queue while calculating sum and plus the result to the current value
        int sum = 0;
        while (!q.isEmpty()) {
            TreeNode node = q.pollFirst();
            node.val += sum;
            sum = node.val;
        }

        return root;
    }
}
