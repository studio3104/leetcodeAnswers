package com.studio3104.leetcode.explore.challenge.November.day23;

import com.studio3104.leetcode.structure.TreeNode;

class Solution {
    private int rob(TreeNode tree, int skipCount, TreeNode cache) {
        if (tree == null) return 0;
        if (skipCount < 0) skipCount += 2;
        if (cache == null) cache = new TreeNode(0);

        int left;
        int right;

        if (skipCount == 0) {
            if (cache.val > 0) return cache.val;

            left = Math.max(rob(tree.left, 1, cache.left), rob(tree.left, 2, cache.left));
            right = Math.max(rob(tree.right, 1, cache.right), rob(tree.right, 2, cache.right));

            cache.val = tree.val + left + right;
            return cache.val;
        }

        left = Math.max(rob(tree.left, skipCount - 1, cache.left), rob(tree.left, skipCount - 2, cache.left));
        right = Math.max(rob(tree.right, skipCount - 1, cache.right), rob(tree.right, skipCount - 2, cache.right));
        return left + right;
    }

    public int rob(TreeNode root) {
        if (root == null) return 0;

        TreeNode cache = new TreeNode(0, new TreeNode(0), new TreeNode(0));

        int left = Math.max(rob(root.left, 0, cache.left), rob(root.left, 1, cache.left));
        int right = Math.max(rob(root.right, 0, cache.right), rob(root.right, 1, cache.right));

        return Math.max(
                Math.max(rob(root, 0,cache), left + right),
                Math.max(left, right)
        );
    }
}
