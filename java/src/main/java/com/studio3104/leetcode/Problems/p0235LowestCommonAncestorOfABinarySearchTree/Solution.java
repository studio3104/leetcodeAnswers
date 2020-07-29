package com.studio3104.leetcode.Problems.p0235LowestCommonAncestorOfABinarySearchTree;

import com.studio3104.leetcode.structure.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int c = root.val;
        if (p.val == c) return p;
        if (q.val == c) return q;
        if (p.val < c && q.val < c) return lowestCommonAncestor(root.left, p, q);
        if (p.val > c && q.val > c) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
