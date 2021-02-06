package com.studio3104.leetcode.explore.challenge.y2021.February.day06;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    private void rightSideView(TreeNode current, int level, Map<Integer, Integer> result) {
        if (current == null) {
            return;
        }
        result.put(level, current.val);
        rightSideView(current.left, level + 1, result);
        rightSideView(current.right, level + 1, result);
    }

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        Map<Integer, Integer> result = new HashMap<>();
        // Traverse the tree inorder
        // Collect the last element that appeared in each level
        rightSideView(root, 0, result);

        return IntStream.range(0, result.size())
                .map(result::get)
                .boxed()
                .collect(Collectors.toList());
    }
}
