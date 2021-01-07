package com.studio3104.leetcode.explore.challenge.y2020.August.day08;

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
                Arguments.of("[10,5,-3,3,2,null,11,3,-2,null,1]", 8, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void pathSum(
            @ConvertWith(TreeNodeConverter.class) TreeNode root, int sum,
            int expected
    ) {
        int result = solution.pathSum(root, sum);
        Assertions.assertEquals(expected, result);
    }
}
