package com.studio3104.leetcode.explore.challenge.y2020.October.day06;

import com.studio3104.leetcode.structure.TreeNode;

public class Solution {
    TreeNode toAdd;

    private TreeNode insertIntoBST(TreeNode tree) {
        if (tree == null) return toAdd;
        if (toAdd.val > tree.val) tree.right = insertIntoBST(tree.right);
        else tree.left = insertIntoBST(tree.left);
        return tree;
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        toAdd = new TreeNode(val);
        return insertIntoBST(root);
    }
}
