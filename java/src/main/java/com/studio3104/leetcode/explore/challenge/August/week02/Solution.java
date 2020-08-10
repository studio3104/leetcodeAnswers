package com.studio3104.leetcode.explore.challenge.August.week02;

import com.studio3104.leetcode.structure.TreeNode;

class Solution {
    private double target;
    private int closest;
    private double minDiff;

    private int closestValue(TreeNode root) {
        if (root == null) return closest;

        double currentDiff = Math.abs(target - root.val);
        if (currentDiff < minDiff) {
            minDiff = currentDiff;
            closest = root.val;
        }

        if (target < root.val) {
            return closestValue(root.left);
        } else {
            return closestValue(root.right);
        }
    }

    public int closestValue(TreeNode root, double target) {
        this.target = target;
        closest = root.val;
        minDiff = Math.abs(target - root.val);
        return closestValue(root);
    }
}
