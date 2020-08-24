package com.studio3104.leetcode.explore.challenge.August.day24;

import com.studio3104.leetcode.structure.TreeNode;

public class Solution {
    int sumOfLeftLeaves(TreeNode tree, boolean isLeft) {
        if (tree == null) return 0;
        if (isLeft && tree.left == null && tree.right == null) return tree.val;
        return sumOfLeftLeaves(tree.left, true) + sumOfLeftLeaves(tree.right, false);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }
}
