package com.studio3104.leetcode.explore.challenge.y2020.October.day06;

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
                Arguments.of("[4,2,7,1,3]", 5, "[4,2,7,1,3,5]"),
                Arguments.of("[40,20,60,10,30,50,70]", 25, "[40,20,60,10,30,50,70,null,null,25]"),
                Arguments.of("[4,2,7,1,3,null,null,null,null,null,null]", 5, "[4,2,7,1,3,5]")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void insertIntoBST(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            int val,
            @ConvertWith(TreeNodeConverter.class) TreeNode expected
    ) {
        TreeNode result = solution.insertIntoBST(root, val);
        Assertions.assertEquals(expected, result);
    }
}
