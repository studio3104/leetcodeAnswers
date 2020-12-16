package com.studio3104.leetcode.explore.challenge.December.day16;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    private void enqueueInorder(TreeNode node, Deque<TreeNode> q) {
        if (node == null) {
            return;
        }

        enqueueInorder(node.left, q);
        q.add(node);
        enqueueInorder(node.right, q);
    }

    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        enqueueInorder(root, q);

        if (q.isEmpty()) {
            return true;
        }

        int current = q.pollFirst().val;

        while (!q.isEmpty()) {
            TreeNode node = q.pollFirst();
            if (node.val <= current) {
                return false;
            }
            current = node.val;
        }

        return true;
    }
}
