package com.studio3104.leetcode.explore.challenge.November.day23;

import com.studio3104.leetcode.structure.TreeNode;

class Solution {
    private int traverse(TreeNode tree, int skipCount) {
        if (tree == null || skipCount < 0) return 0;

        if (skipCount == 0) {
            return tree.val + Math.max(
                    traverse(tree.left, 1) + traverse(tree.right, 1),
                    traverse(tree.left, 2) + traverse(tree.right, 2)
            );
        }

        return Math.max(
                traverse(tree.left, skipCount - 1) + traverse(tree.right, skipCount - 1),
                traverse(tree.left, skipCount - 2) + traverse(tree.right, skipCount - 2)
        );
    }

    public int rob(TreeNode root) {
        if (root == null) return 0;

        return Math.max(
                traverse(root, 0),
                traverse(root.left, 0) + traverse(root.right, 0)
        );
    }
}
