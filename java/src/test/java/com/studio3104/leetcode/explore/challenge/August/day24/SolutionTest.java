package com.studio3104.leetcode.explore.challenge.August.day24;

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
                Arguments.of("[3,9,20,null,null,15,7]", 24),
                Arguments.of("[]", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void sumOfLeftLeaves(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            int expected
    ) {
        int result = solution.sumOfLeftLeaves(root);
        Assertions.assertEquals(expected, result);
    }
}
