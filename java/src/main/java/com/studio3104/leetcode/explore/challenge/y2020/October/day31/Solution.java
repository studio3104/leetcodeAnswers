package com.studio3104.leetcode.explore.challenge.y2020.October.day31;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    private void inorderTraverse(TreeNode tree, List<TreeNode> list) {
        if (tree == null) return;
        inorderTraverse(tree.left, list);
        list.add(tree);
        inorderTraverse(tree.right, list);
    }

    public void recoverTree(TreeNode root) {
        List<TreeNode> inorderedList = new ArrayList<>();
        inorderTraverse(root, inorderedList);
        int[] sortedValues = inorderedList
                .stream()
                .mapToInt(t -> t.val)
                .sorted()
                .toArray();

        int[] vi = IntStream
                .range(0, inorderedList.size())
                .filter(i -> inorderedList.get(i).val != sortedValues[i])
                .toArray();

        TreeNode tempLeft = inorderedList.get(vi[0]).left;
        TreeNode tempRight = inorderedList.get(vi[0]).right;
        inorderedList.get(vi[0]).left = inorderedList.get(vi[1]).left;
        inorderedList.get(vi[0]).right = inorderedList.get(vi[1]).right;
        inorderedList.get(vi[1]).left = tempLeft;
        inorderedList.get(vi[1]).right = tempRight;
    }
}

