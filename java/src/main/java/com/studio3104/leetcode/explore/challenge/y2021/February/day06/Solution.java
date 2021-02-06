package com.studio3104.leetcode.explore.challenge.y2021.February.day06;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private void appendRightSideView(TreeNode current, List<Integer> result) {
        while (current != null) {
            result.add(current.val);
            current = current.right != null ? current.right : current.left;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        // Traverse the right side of the tree during checking its depth
        // (The depth is gonna be same as the length of the result)
        // If the right side is null, then check the left side
        // Finish the 1st iteration if both sides are null
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        appendRightSideView(current, result);

        // Iterate the tree again from root, the first destination is gonna be left, thereafter right
        // Continue traversing until it reaches the depth that was checked in the previous loop
        // Take the same approach with the 1st iteration
        current = root.left;
        int depth = result.size();
        for (; depth >= -1 && current != null; --depth) {
            current = current.right != null ? current.right : current.left;
        }
        appendRightSideView(current, result);

        return result;
    }
}
