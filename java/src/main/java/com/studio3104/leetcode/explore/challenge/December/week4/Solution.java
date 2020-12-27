package com.studio3104.leetcode.explore.challenge.December.week4;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
        if (root == null) {
            return null;
        }

        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            int level = q.size();

            for (int i = 0; i < level; i++) {
                TreeNode current = q.poll();

                if (current == null) {
                    return null;
                }

                if (current == u) {
                    return i == level - 1 ? null : q.poll();
                }

                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
            }
        }

        return null;
    }
}
