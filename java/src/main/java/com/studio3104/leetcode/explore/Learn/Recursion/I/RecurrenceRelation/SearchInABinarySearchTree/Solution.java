package com.studio3104.leetcode.explore.Learn.Recursion.I.RecurrenceRelation.SearchInABinarySearchTree;

import com.studio3104.leetcode.structure.TreeNode;

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return (root == null || root.val == val) ? root : searchBST(root.val > val ? root.left : root.right, val);
    }
}
