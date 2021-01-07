package com.studio3104.leetcode.explore.challenge.y2020.August.day08;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    int count;

    public int pathSum(TreeNode root, int sum) {
        count = 0;
        pathSum(root, sum, new ArrayList<>());
        return count;
    }

    private void pathSum(TreeNode root, int sum, List<Integer> sums) {
        if (root == null) return;

        int current = root.val;
        if (current == sum) ++count;

        List<Integer> newSums = new ArrayList<>();
        for (int s: sums) {
            int c = current + s;
            if (c == sum) ++count;
            newSums.add(c);
        }

        newSums.add(current);
        pathSum(root.left, sum, newSums);
        pathSum(root.right, sum, newSums);
    }
}
