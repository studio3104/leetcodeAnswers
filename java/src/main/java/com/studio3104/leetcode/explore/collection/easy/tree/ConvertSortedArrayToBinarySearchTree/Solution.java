package com.studio3104.leetcode.explore.collection.easy.tree.ConvertSortedArrayToBinarySearchTree;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.Arrays;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;

        int pivotIndex = nums.length / 2;
        TreeNode root = new TreeNode(nums[pivotIndex]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, pivotIndex));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, pivotIndex + 1, nums.length));

        return root;
    }
}
