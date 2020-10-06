package com.studio3104.leetcode.explore.challenge.October.day06;

import com.studio3104.leetcode.structure.TreeNode;

public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        TreeNode current = root;

        while (true) {
            if (val > current.val) {
                if (current.right == null) {
                    current.right = new TreeNode(val);
                    break;
                }
                current = current.right;
            } else {
                if (current.left == null) {
                    current.left = new TreeNode(val);
                    break;
                }
                current = current.left;
            }
        }

        return root;
    }
}
