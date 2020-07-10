package com.studio3104.leetcode.structure;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) { this.val = val; }

    public static TreeNode createFromString(String data) {
        if (data.equals("[]"))
            return null;

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
