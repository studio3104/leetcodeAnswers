package com.studio3104.leetcode.explore.challenge.December.day12;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    private void checkDepth(TreeNode node, int depth, Map<Integer, Set<TreeNode>> nodesOf) {
        if (node == null) return;

        nodesOf.putIfAbsent(depth, new HashSet<>());
        nodesOf.get(depth).add(node);

        checkDepth(node.left, depth + 1, nodesOf);
        checkDepth(node.right, depth + 1, nodesOf);
    }

    private TreeNode findSubTree(TreeNode node, Set<TreeNode> deepestNodes) {
        if (node == null || deepestNodes.contains(node)) {
            return node;
        }

        TreeNode left = findSubTree(node.left, deepestNodes);
        TreeNode right = findSubTree(node.right, deepestNodes);

        if (left != null && right != null) return node;
        return left != null ? left : right;
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        Map<Integer, Set<TreeNode>> nodesOf = new HashMap<>();
        checkDepth(root, 0, nodesOf);
        int maxDepth = nodesOf.keySet().stream().mapToInt(n -> n).max().orElse(-1);

        return findSubTree(root, nodesOf.get(maxDepth));
    }

}
