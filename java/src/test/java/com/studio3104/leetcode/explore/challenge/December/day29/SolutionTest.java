package com.studio3104.leetcode.explore.challenge.December.day29;

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
                Arguments.of("[2,3,1,3,1,null,1]", 2),
                Arguments.of("[2,1,1,1,3,null,null,null,null,null,1]", 1),
                Arguments.of("[9]", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void pseudoPalindromicPaths(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            int expected
    ) {
        int actual = solution.pseudoPalindromicPaths(root);
        Assertions.assertEquals(expected, actual);
    }
}
