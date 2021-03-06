package com.studio3104.leetcode.explore.challenge.y2021.March.day05;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    private void collectNumsPerLevel(TreeNode tree, int level, Map<Integer, List<Integer>> numsPerLevelOf) {
        if (tree == null) {
            return;
        }

        numsPerLevelOf.putIfAbsent(level, new ArrayList<>());
        numsPerLevelOf.get(level).add(tree.val);
        collectNumsPerLevel(tree.left, level + 1, numsPerLevelOf);
        collectNumsPerLevel(tree.right, level + 1, numsPerLevelOf);
    }

    public List<Double> averageOfLevels(TreeNode root) {
        Map<Integer, List<Integer>> numsPerLevelOf = new HashMap<>();
        collectNumsPerLevel(root, 0, numsPerLevelOf);

        return IntStream.range(0, numsPerLevelOf.size())
                .mapToDouble(i -> numsPerLevelOf.get(i).stream()
                        .mapToInt(n -> n)
                        .average()
                        .orElse(0))
                .boxed()
                .collect(Collectors.toList());
    }
}
