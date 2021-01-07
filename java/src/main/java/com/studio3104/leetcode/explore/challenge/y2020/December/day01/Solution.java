package com.studio3104.leetcode.explore.challenge.y2020.December.day01;

import com.studio3104.leetcode.structure.TreeNode;

class Solution {
    private int maxDepth(TreeNode tree, int currentMaxDepth) {
        if (tree == null) {
            return currentMaxDepth;
        }

        return Math.max(
                maxDepth(tree.left, currentMaxDepth + 1),
                maxDepth(tree.right, currentMaxDepth + 1)
        );
    }

    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }
}
