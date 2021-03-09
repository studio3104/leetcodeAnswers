package com.studio3104.leetcode.explore.challenge.y2021.March.day09;

import com.studio3104.leetcode.structure.TreeNode;

class Solution {
    private void insertValue(TreeNode node, int depth, int v, int d) {
        if (node == null || depth >= d) {
            return;
        }

        TreeNode left = node.left;
        TreeNode right = node.right;

        if (++depth == d) {
            node.left = new TreeNode(v, left, null);
            node.right = new TreeNode(v, null, right);
            return;
        }

        insertValue(left, depth, v, d);
        insertValue(right, depth, v, d);
    }

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        TreeNode pseudo = new TreeNode(0);
        pseudo.left = root;
        insertValue(pseudo, 0, v, d);
        return pseudo.left;
    }
}
