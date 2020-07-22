package com.studio3104.leetcode.explore.challenge.july.day22;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzag = new ArrayList<>();
        if (root == null) return zigzag;

        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        q.addLast(null);

        LinkedList<Integer> level = new LinkedList<>();
        boolean isLeft = true;

        while (!q.isEmpty()) {
            TreeNode current = q.pollFirst();

            if (current == null) {
                zigzag.add(level);
                level = new LinkedList<>();
                if (!q.isEmpty()) q.addLast(null);
                isLeft = !isLeft;
                continue;
            }

            if (isLeft) level.addLast(current.val);
            else level.addFirst(current.val);

            if (current.left != null) q.addLast(current.left);
            if (current.right != null) q.addLast(current.right);
        }

        return zigzag;
    }
}
