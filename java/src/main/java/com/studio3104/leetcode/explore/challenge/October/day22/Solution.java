package com.studio3104.leetcode.explore.challenge.October.day22;

import com.studio3104.leetcode.structure.TreeNode;

public class Solution {
    private int minDepth(TreeNode tree, int currentDepth, int minimumDepth) {
        if (tree.left == null && tree.right == null) {
            return Math.min(currentDepth, minimumDepth);
        }
        if (currentDepth >= minimumDepth) {
            return minimumDepth;
        }

        int left = tree.left != null ? minDepth(tree.left, currentDepth + 1, minimumDepth) : Integer.MAX_VALUE;
        int right = tree.right != null ? minDepth(tree.right, currentDepth + 1, minimumDepth) : Integer.MAX_VALUE;
        return Math.min(left, right);

    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return minDepth(root, 1, Integer.MAX_VALUE);
    }
}
