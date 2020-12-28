package com.studio3104.leetcode.explore.collection.medium.TreesAndGraphs.KthSmallestElementInABST;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> q = new ArrayDeque<>();
        TreeNode current = root;

        while (true) {
            while (current != null) {
                q.add(current);
                current = current.left;
            }

            current = q.removeLast();

            if (--k == 0) {
                return current.val;
            }

            current = current.right;
        }
    }
}
