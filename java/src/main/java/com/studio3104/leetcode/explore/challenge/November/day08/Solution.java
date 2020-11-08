package com.studio3104.leetcode.explore.challenge.November.day08;

import com.studio3104.leetcode.structure.TreeNode;

class Solution {
    private int[] traverse(TreeNode treeNode) {
        if (treeNode == null) return new int[]{0, 0};

        int[] left = traverse(treeNode.left);
        int[] right = traverse(treeNode.right);

        return new int[]{
                left[0] + right[0] + Math.abs(left[1] - right[1]),
                left[1] + right[1] + treeNode.val
        };
    }

    public int findTilt(TreeNode root) {
        return traverse(root)[0];
    }
}
