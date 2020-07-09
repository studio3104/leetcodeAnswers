package com.studio3104.leetcode.explore.collection.easy.tree.MaximumDepthOfBinaryTree;

import com.studio3104.leetcode.structure.TreeNode;

public class Solution {
    int getMaxDepth(TreeNode tree) { return getMaxDepth(tree, 1); }
    int getMaxDepth(TreeNode tree, int depth) {
        if (tree == null || tree.right == null && tree.left == null) return depth;
        depth++;
        return Math.max(getMaxDepth(tree.left, depth), getMaxDepth(tree.right, depth));
    }

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : getMaxDepth(root);
    }
}
