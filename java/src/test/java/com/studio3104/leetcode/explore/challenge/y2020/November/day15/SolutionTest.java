package com.studio3104.leetcode.explore.challenge.y2020.November.day15;

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
                Arguments.of("[10,5,15,3,7,null,18]", 7, 15, 32),
                Arguments.of("[10,5,15,3,7,13,18,1,null,6]", 6, 10, 23)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void rangeSumBST(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            int low,
            int high,
            int expected
    ) {
        int actual = solution.rangeSumBST(root, low, high);
        Assertions.assertEquals(expected, actual);
    }
}
