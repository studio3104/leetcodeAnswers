package com.studio3104.leetcode.explore.collection.easy.tree.BinaryTreeLevelOrderTraversal;

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
                Arguments.of("[3,9,20,null,null,15,7]", List.of(
                        List.of(3),
                        List.of(9, 20),
                        List.of(15, 7)
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void levelOrder(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            List<List<Integer>> expected
    ) {
        List<List<Integer>> result = solution.levelOrder(root);
        Assertions.assertEquals(expected, result);
    }
}