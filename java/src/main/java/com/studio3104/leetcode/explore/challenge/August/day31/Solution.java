package com.studio3104.leetcode.explore.challenge.August.day31;

import com.studio3104.leetcode.structure.TreeNode;

class Solution {
    TreeNode deleteNode(TreeNode toDelete) {
        TreeNode rightMinParent = null;
        TreeNode rightMin = toDelete.right;
        if (rightMin == null) return toDelete.left;

        while (rightMin.left != null) {
            rightMinParent = rightMin;
            rightMin = rightMin.left;
        }
        if (rightMinParent != null) rightMinParent.left = rightMin.right;
        rightMin.left = toDelete.left;

        return rightMin;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        boolean isRight = true;
        TreeNode parent = null;
        TreeNode tree = root;

        while (tree != null) {
            if (tree.val == key) {
                TreeNode branch = deleteNode(tree);
                if (parent == null) return branch;
                if (isRight) parent.right = branch;
                else parent.left = branch;
                break;
            }
            parent = tree;
            isRight = tree.val < key;
            if (isRight) tree = tree.right;
            else tree = tree.left;
        }

        return root;
    }
}
