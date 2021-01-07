package com.studio3104.leetcode.explore.challenge.y2020.December.week4;

import com.studio3104.leetcode.structure.TreeNode;
import com.studio3104.leetcode.structure.TreeNodeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("[1,2,3,null,4,5,6]", 4, 5),
                Arguments.of("[3,null,4,2]", 2, null),
                Arguments.of("[1]", 1, null),
                Arguments.of("[3,4,2,null,null,null,1]", 4, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findNearestRightNode(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            int uNum,
            Integer expectedNum
    ) {
        TreeNode u = null;
        TreeNode expected = null;

        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            if (current.val == uNum) u = current;
            if (expectedNum != null && current.val == expectedNum) expected = current;
            if (u != null && (expectedNum == null || expected != null)) break;
            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
        }

        TreeNode actual = solution.findNearestRightNode(root, u);
        Assertions.assertEquals(expected, actual);
    }
}
