package com.studio3104.leetcode.explore.challenge.November.day15;

import com.studio3104.leetcode.structure.TreeNode;

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int sum = rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        return sum;
    }
}
