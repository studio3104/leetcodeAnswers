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
        // Finish the 1st iteration if both sides of current node are null
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        appendRightSideView(current, result);

        // Iterate the tree again from root
        // If there is a path on the left, prioritize the left side only once
        // Continue traversing until it reaches the depth that was checked in the previous loop
        // Thereafter, take the same approach with the 1st iteration
        current = root;
        int depth = result.size();
        boolean hasPassedLeft = false;

        for (; depth > 0 && current != null; --depth) {
            if (!hasPassedLeft && current.left != null) {
                current = current.left;
                hasPassedLeft = true;
                continue;
            }
            current = current.right != null ? current.right : current.left;
        }

        appendRightSideView(current, result);

        return result;
    }
}
