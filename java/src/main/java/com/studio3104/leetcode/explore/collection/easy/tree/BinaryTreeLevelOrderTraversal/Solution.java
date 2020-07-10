package com.studio3104.leetcode.explore.collection.easy.tree.BinaryTreeLevelOrderTraversal;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    void traverse(TreeNode tree, int level, List<List<Integer>> levelOrderList) {
        if (levelOrderList.size() < level + 1) levelOrderList.add(new ArrayList<>());
        levelOrderList.get(level).add(tree.val);

        if (tree.left != null) traverse(tree.left, level + 1, levelOrderList);
        if (tree.right != null) traverse(tree.right, level + 1, levelOrderList);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrderList = new ArrayList<>();
        if (root == null) return levelOrderList;
        traverse(root, 0, levelOrderList);
        return levelOrderList;
    }
}
