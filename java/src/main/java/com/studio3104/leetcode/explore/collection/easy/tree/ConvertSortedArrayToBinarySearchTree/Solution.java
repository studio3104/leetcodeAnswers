package com.studio3104.leetcode.explore.collection.easy.tree.ConvertSortedArrayToBinarySearchTree;

import com.studio3104.leetcode.structure.TreeNode;

public class Solution {
    TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) return null;

        int pivotIndex = (left + right) / 2;
        TreeNode root = new TreeNode(nums[pivotIndex]);
        root.left = sortedArrayToBST(nums, left, pivotIndex - 1);
        root.right = sortedArrayToBST(nums, pivotIndex + 1, right);

        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }
}
