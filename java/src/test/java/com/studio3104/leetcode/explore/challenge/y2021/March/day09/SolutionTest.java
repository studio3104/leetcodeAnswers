package com.studio3104.leetcode.explore.challenge.y2021.March.day09;

import com.studio3104.leetcode.structure.TreeNode;
import com.studio3104.leetcode.structure.TreeNodeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("[4,2,6,3,1,5]", 1, 2, "[4,1,1,2,null,null,6,3,1,5]"),
                Arguments.of("[4,2,null,3,1]", 1, 3, "[4,2,null,1,1,3,null,null,1]")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void addOneRow(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            int v,
            int d,
            @ConvertWith(TreeNodeConverter.class) TreeNode expected
    ) {
        Solution solution = new Solution();
        TreeNode actual = solution.addOneRow(root, v, d);
        Assertions.assertEquals(expected, actual);
    }
}
