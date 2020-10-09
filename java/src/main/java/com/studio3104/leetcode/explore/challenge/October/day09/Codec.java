package com.studio3104.leetcode.explore.challenge.October.day09;

import com.studio3104.leetcode.structure.TreeNode;

public class Codec {
    private int checkDepth(TreeNode tree) {
        if (tree == null) return 0;
        return Math.max(checkDepth(tree.left), checkDepth(tree.right)) + 1;
    }

    private void BFS(TreeNode tree, int level, StringBuilder sb) {
        if (tree == null) {
            sb.append("null,");
            return;
        }
        if (level == 1) {
            sb.append(tree.val).append(',');
            return;
        }

        BFS(tree.left, level - 1, sb);
        BFS(tree.right, level - 1, sb);
    }

    public String serialize(TreeNode root) {
        if (root == null) return "[]";

        StringBuilder serialized = new StringBuilder();
        serialized.append('[');

        int depth = checkDepth(root);
        for (int i = 1; i <= depth; ++i) BFS(root, i, serialized);

        serialized.append(']');
        return serialized.toString();
    }

    public TreeNode deserialize(String data) {
        if (data.equals("[]")) return null;

        data = data.substring(1, data.length() - 1);
        String[] split = data.split(",");

        int len = split.length;
        TreeNode[] treeNodes = new TreeNode[len];

        for (int i = 0; i < len; i++) {
            if (!split[i].equals("null"))
                treeNodes[i] = new TreeNode(Integer.parseInt(split[i]));
        }

        for (int i = 0; i < len; i++) {
            if (treeNodes[i] != null) {
                int leftIndex = i * 2 + 1;
                if (leftIndex < len)
                    treeNodes[i].left = treeNodes[leftIndex];

                int rightIndex = leftIndex + 1;
                if (rightIndex < len)
                    treeNodes[i].right = treeNodes[rightIndex];
            }
        }

        return treeNodes[0];
    }
}
