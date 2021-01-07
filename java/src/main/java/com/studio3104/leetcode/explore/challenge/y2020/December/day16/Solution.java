package com.studio3104.leetcode.explore.challenge.y2020.December.day16;

import com.studio3104.leetcode.structure.TreeNode;

public class Solution {
    boolean isValidBST(TreeNode tree, long max, long min) {
        if (tree == null) {
            return true;
        }

        if (tree.val >= min || tree.val <= max) {
            return false;
        }

        return isValidBST(tree.left, max, tree.val) && isValidBST(tree.right, tree.val, min);
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
