package com.studio3104.leetcode.explore.collection.easy.tree.SymmetricTree;

import com.studio3104.leetcode.structure.TreeNode;

public class Solution {
    boolean areSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return left.val == right.val && areSymmetric(right.left, left.right) && areSymmetric(left.left, right.right);
    }

    public boolean isSymmetric(TreeNode root) {
        return root == null || areSymmetric(root.left, root.right);
    }
}
