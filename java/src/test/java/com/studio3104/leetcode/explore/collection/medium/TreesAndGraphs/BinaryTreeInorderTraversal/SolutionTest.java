package com.studio3104.leetcode.explore.collection.medium.TreesAndGraphs.BinaryTreeInorderTraversal;

import com.studio3104.leetcode.structure.TreeNode;
import com.studio3104.leetcode.structure.TreeNodeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("[1,null,2,null,null,3]", List.of(1, 3, 2)),
                Arguments.of("[]", List.of()),
                Arguments.of("[1]", List.of(1)),
                Arguments.of("[1,2]", List.of(2, 1)),
                Arguments.of("[1,null,2]", List.of(1, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void inorderTraversal(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            List<Integer> expected
    ) {
        List<Integer> actual = solution.inorderTraversal(root);
        Assertions.assertEquals(expected, actual);
    }
}
