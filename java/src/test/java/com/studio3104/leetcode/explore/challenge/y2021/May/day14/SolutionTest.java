package com.studio3104.leetcode.explore.challenge.y2021.May.day14;

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
                Arguments.of("[1,2,5,3,4,null,6]", "[1,null,2,null,3,null,4,null,5,null,6]"),
                Arguments.of("[]", "[]"),
                Arguments.of("[0]", "[0]")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void flatten(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            @ConvertWith(TreeNodeConverter.class) TreeNode expected
    ) {
        Solution solution = new Solution();
        solution.flatten(root);
        Assertions.assertEquals(expected, root);
    }
}
