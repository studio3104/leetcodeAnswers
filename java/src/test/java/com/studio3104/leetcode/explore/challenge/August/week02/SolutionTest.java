package com.studio3104.leetcode.explore.challenge.August.week02;

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
                Arguments.of("[4,2,5,1,3]", 3.714286, 4),
                Arguments.of("[0]", 2147483648.0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void closestValue(
            @ConvertWith(TreeNodeConverter.class) TreeNode root, double target,
            int expected
    ) {
        int result = solution.closestValue(root, target);
        Assertions.assertEquals(expected, result);
    }
}
