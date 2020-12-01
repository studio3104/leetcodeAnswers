package com.studio3104.leetcode.explore.challenge.December.day01;

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
                Arguments.of("[3,9,20,null,null,15,7]", 3),
                Arguments.of("[1,null,2]", 2),
                Arguments.of("[]", 0),
                Arguments.of("[0]", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void maxDepth(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            int expected
    ) {
        int actual = solution.maxDepth(root);
        Assertions.assertEquals(expected, actual);
    }
}
