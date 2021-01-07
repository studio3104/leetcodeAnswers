package com.studio3104.leetcode.explore.challenge.y2020.July.day09;

import com.studio3104.leetcode.structure.TreeNode;
import com.studio3104.leetcode.structure.TreeNodeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("[1,3,2,5,3,null,9]", 4),
                Arguments.of("[1,2,3]", 2),
                Arguments.of("[1,3,null,5,3]", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void widthOfBinaryTree(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            int expected
    ) {
        int result = solution.widthOfBinaryTree(root);
        Assertions.assertEquals(expected, result);
    }
}
