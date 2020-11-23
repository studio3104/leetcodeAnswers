package com.studio3104.leetcode.explore.challenge.November.day23;

import com.studio3104.leetcode.structure.TreeNode;

class Solution {
    private int[] robSub(TreeNode root) {
        if (root == null) return new int[2];

        int[] left = robSub(root.left);
        int[] right = robSub(root.right);
        int[] result = new int[2];

        result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        result[1] = root.val + left[0] + right[0];

        return result;
    }

    public int rob(TreeNode root) {
        int[] result = robSub(root);
        return Math.max(result[0], result[1]);
    }
}

class _Solution {
    private TreeNode constructCache(TreeNode tree, TreeNode cache) {
        if (tree != null) {
            cache.left = constructCache(tree.left, new TreeNode());
            cache.right = constructCache(tree.right, new TreeNode());
        }
        return cache;
    }

    private int rob(TreeNode tree, int skipCount, TreeNode cache) {
        if (tree == null) return 0;

        if (skipCount < 0) skipCount += 2;
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

        TreeNode cache = constructCache(root, new TreeNode());

        int left = Math.max(rob(root.left, 0, cache.left), rob(root.left, 1, cache.left));
        int right = Math.max(rob(root.right, 0, cache.right), rob(root.right, 1, cache.right));

        return Math.max(rob(root, 0, cache), left + right);
    }
}
