package com.studio3104.leetcode.explore.challenge.y2020.November.day08;

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
                Arguments.of("[1,2,3]", 1),
                Arguments.of("[4,2,9,3,5,null,7]", 15),
                Arguments.of("[21,7,14,1,1,2,2,3,3]", 9)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findTilt(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            int expected
    ) {
        int actual = solution.findTilt(root);
        Assertions.assertEquals(expected, actual);
    }
}
