package com.studio3104.leetcode.explore.challenge.y2020.December.day12;

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
                Arguments.of("[3,5,1,6,2,0,8,null,null,7,4]", "[2,7,4]"),
                Arguments.of("[1]", "[1]"),
                Arguments.of("[0,1,3,null,2]", "[2]")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void subtreeWithAllDeepest(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            @ConvertWith(TreeNodeConverter.class) TreeNode expected
    ) {
        TreeNode actual = solution.subtreeWithAllDeepest(root);
        Assertions.assertEquals(expected, actual);
    }
}
