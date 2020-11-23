package com.studio3104.leetcode.explore.challenge.November.day23;

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
                Arguments.of("[3,2,3,null,3,null,1]", 7),
                Arguments.of("[3,4,5,1,3,null,1]", 9),
                Arguments.of("[2,1,3,null,4]", 7),
                Arguments.of("[5,3,6,1,4,null,null,null,2]", 12)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void rob(@ConvertWith(TreeNodeConverter.class) TreeNode root, int expected) {
        int actual = solution.rob(root);
        Assertions.assertEquals(expected, actual);
    }
}
