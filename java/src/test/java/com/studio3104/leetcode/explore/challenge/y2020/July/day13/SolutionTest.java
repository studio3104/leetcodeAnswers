package com.studio3104.leetcode.explore.challenge.y2020.July.day13;

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
                Arguments.of("[1,2,3]", "[1,2,3]", true),
                Arguments.of("[1,2]", "[1,null,2]", false),
                Arguments.of("[1,2,1]", "[1,1,2]", false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void isSameTree(
            @ConvertWith(TreeNodeConverter.class) TreeNode p,
            @ConvertWith(TreeNodeConverter.class) TreeNode q,
            boolean expected
    ) {
        boolean result = solution.isSameTree(p, q);
        Assertions.assertEquals(expected, result);
    }
}