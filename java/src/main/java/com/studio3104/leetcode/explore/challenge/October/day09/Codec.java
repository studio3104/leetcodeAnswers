package com.studio3104.leetcode.explore.challenge.October.day09;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.LinkedList;

public class Codec {
    public String serialize(TreeNode root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        LinkedList<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.pollFirst();

            if (node == null) {
                sb.append("null,");
                continue;
            }

            sb.append(node.val).append(',');
            nodeQueue.add(node.left);
            nodeQueue.add(node.right);
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if (data.length() == 0) return null;

        String[] parts = data.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        LinkedList<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 1;
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.pollFirst();

            if (index == parts.length) break;

            item = parts[index++];
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }

            if (index == parts.length) break;

            item = parts[index++];
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }

        return root;
    }
}
