package com.studio3104.leetcode.explore.challenge.December.day16;

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
                Arguments.of("[2,1,3]", true),
                Arguments.of("[5,1,4,null,null,3,6]", false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void isValidBST(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            boolean expected
    ) {
        boolean actual = solution.isValidBST(root);
        Assertions.assertEquals(expected, actual);
    }
}
