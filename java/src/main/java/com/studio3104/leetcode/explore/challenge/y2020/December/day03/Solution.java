package com.studio3104.leetcode.explore.challenge.y2020.December.day03;

import com.studio3104.leetcode.structure.TreeNode;

class Solution {
    private TreeNode current;

    private void rearrangeInOrder(TreeNode node) {
        if (node == null) return;

        rearrangeInOrder(node.left);
        node.left = null;
        current.right = node;
        current = node;
        rearrangeInOrder(node.right);
    }

    public TreeNode increasingBST(TreeNode root) {
        TreeNode pseudo = new TreeNode();
        current = pseudo;
        rearrangeInOrder(root);
        return pseudo.right;
    }
}
