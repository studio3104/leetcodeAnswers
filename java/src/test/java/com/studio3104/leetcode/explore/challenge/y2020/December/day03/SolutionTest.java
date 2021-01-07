package com.studio3104.leetcode.explore.challenge.y2020.December.day03;

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
                Arguments.of("[5,3,6,2,4,null,8,1,null,null,null,7,9]", "[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]"),
                Arguments.of("[5,1,7]", "[1,null,5,null,7]")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void increasingBST(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            @ConvertWith(TreeNodeConverter.class) TreeNode expected
    ) {
        TreeNode actual = solution.increasingBST(root);
        Assertions.assertEquals(expected, actual);
    }
}
