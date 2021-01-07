package com.studio3104.leetcode.explore.challenge.y2020.July.day27;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> indexes;
    int postIndex;
    int[] postorder;

    TreeNode buildTree(int left, int right) {
        if (left > right) return null;

        int val = postorder[postIndex--];
        TreeNode root = new TreeNode(val);
        int index = indexes.get(val);

        root.right = buildTree(index + 1, right);
        root.left = buildTree(left, index - 1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        this.postorder = postorder;

        indexes = new HashMap<>();
        for (int i = 0; i < inorder.length; ++i) indexes.put(inorder[i], i);

        return buildTree(0, inorder.length - 1);
    }
}
