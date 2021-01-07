package com.studio3104.leetcode.explore.challenge.y2020.September.day05;

import com.studio3104.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    LinkedList<Integer> convertBSTToList(TreeNode tree, LinkedList<Integer> linkedList) {
        if (tree == null) return linkedList;
        convertBSTToList(tree.left, linkedList);
        linkedList.add(tree.val);
        convertBSTToList(tree.right, linkedList);
        return linkedList;
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        LinkedList<Integer> l1 = convertBSTToList(root1, new LinkedList<>());
        LinkedList<Integer> l2 = convertBSTToList(root2, new LinkedList<>());
        List<Integer> allElements = new ArrayList<>();

        while (!l1.isEmpty() || !l2.isEmpty()) {
            Integer n1 = l1.peekFirst(), n2 = l2.peekFirst();
            n1 = n1 == null ? Integer.MAX_VALUE : n1;
            n2 = n2 == null ? Integer.MAX_VALUE : n2;

            if (n1 < n2) allElements.add(l1.pollFirst());
            else allElements.add(l2.pollFirst());
        }

        return allElements;
    }
}
