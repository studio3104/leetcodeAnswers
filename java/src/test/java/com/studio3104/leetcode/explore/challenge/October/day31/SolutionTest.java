package com.studio3104.leetcode.explore.challenge.October.day31;

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
                Arguments.of("[1,3,null,null,2]", "[3,1,null,null,2]"),
                Arguments.of("[3,1,4,null,null,2]", "[2,1,4,null,null,3]")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void recoverTree(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            @ConvertWith(TreeNodeConverter.class) TreeNode expected
    ) {
        solution.recoverTree(root);
        Assertions.assertEquals(expected, root);
    }
}
