package com.studio3104.leetcode.explore.collection.easy.tree.ValidateBinarySearchTree;

import com.studio3104.leetcode.structure.TreeNode;

public class Solution {
    boolean checkIsValidBST(TreeNode tree, long max, long min) {
        if (tree == null) return true;

        if (tree.val >= min) return false;
        if (tree.val <= max) return false;
        return checkIsValidBST(tree.left, max, tree.val) && checkIsValidBST(tree.right, tree.val, min);
    }

    public boolean isValidBST(TreeNode root) {
        return checkIsValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
