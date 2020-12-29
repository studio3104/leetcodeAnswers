package com.studio3104.leetcode.explore.challenge.December.day29;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

class Node {
    TreeNode node;
    int[] counter;
    final boolean isLeaf;

    Node(TreeNode node, int[] counter) {
        this.node = node;
        if (node != null) {
            this.counter = counter.clone();
            ++this.counter[node.val - 1];
        }
        isLeaf = node != null && node.left == null && node.right == null;
    }

    boolean isPalindrome() {
        if (!isLeaf) {
            return false;
        }

        int countOdd = 0;
        for (int n : counter) {
            if (n % 2 == 1 && ++countOdd > 1) {
                return false;
            }
        }

        return true;
    }
}

class Solution {
    public int pseudoPalindromicPaths(TreeNode root) {
        Deque<Node> q = new ArrayDeque<>();
        q.add(new Node(root, new int[9]));

        int numPaths = 0;

        while (!q.isEmpty()) {
            Node c = q.pollFirst();
            if (c.node == null) {
                continue;
            }

            q.add(new Node(c.node.left, c.counter));
            q.add(new Node(c.node.right, c.counter));

            if (c.isPalindrome()) {
                ++numPaths;
            }
        }

        return numPaths;
    }
}
