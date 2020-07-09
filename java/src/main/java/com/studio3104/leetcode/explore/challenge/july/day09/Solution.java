package com.studio3104.leetcode.explore.challenge.july.day09;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int maxWidth = 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        root.val = 0;
        queue.add(root);

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            maxWidth = Math.max(maxWidth, queue.peekLast().val - queue.peekFirst().val + 1);

            for (int i = 0; i < queueSize; i++) {
                TreeNode current = Objects.requireNonNull(queue.poll());

                if (current.left != null) {
                    current.left.val = current.val * 2;
                    queue.add(current.left);
                }
                if (current.right != null) {
                    current.right.val = current.val * 2 + 1;
                    queue.add(current.right);
                }
            }
        }

        return maxWidth;
    }
}
