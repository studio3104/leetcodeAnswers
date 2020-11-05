package com.studio3104.leetcode.explore.Learn.Recursion.I.RecurrenceRelation.SearchInABinarySearchTree;

import com.studio3104.leetcode.structure.TreeNode;

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        return searchBST(root.val > val ? root.left : root.right, val);
    }
}
