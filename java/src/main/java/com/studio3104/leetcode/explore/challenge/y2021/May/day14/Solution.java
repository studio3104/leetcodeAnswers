package com.studio3104.leetcode.explore.challenge.y2021.May.day14;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.Stack;

class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        TreeNode current = new TreeNode();

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }

            current.right = node;
            current.left = null;
            current = node;
        }
    }
}
