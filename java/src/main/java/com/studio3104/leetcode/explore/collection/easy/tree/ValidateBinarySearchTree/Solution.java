package com.studio3104.leetcode.explore.collection.easy.tree.ValidateBinarySearchTree;

import com.studio3104.leetcode.structure.TreeNode;

public class Solution {
    boolean checkIsValidBST(TreeNode tree, Integer max, Integer min) {
        if (tree == null) return true;

        if (min != null && tree.val >= min) return false;
        if (max != null && tree.val <= max) return false;
        return checkIsValidBST(tree.left, max, tree.val) && checkIsValidBST(tree.right, tree.val, min);
    }

    public boolean isValidBST(TreeNode root) {
        return checkIsValidBST(root, null, null);
    }
}
