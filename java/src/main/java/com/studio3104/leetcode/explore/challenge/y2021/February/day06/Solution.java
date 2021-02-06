package com.studio3104.leetcode.explore.challenge.y2021.February.day06;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private void rightSideView(TreeNode current, int level, List<Integer> result) {
        if (current == null) {
            return;
        }
        if (result.size() == level) {
            result.add(current.val);
        }
        rightSideView(current.right, level + 1, result);
        rightSideView(current.left, level + 1, result);
    }

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        List<Integer> result = new ArrayList<>();
        // Traverse the tree inorder (right to left)
        // Collect the first element that appeared in each level
        rightSideView(root, 0, result);

        return result;
    }
}
