package com.studio3104.leetcode.explore.Learn.Recursion.I.RecurrenceRelation.SearchInABinarySearchTree;

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
                Arguments.of("[4,2,7,1,3]", 2, "[2,1,3]")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void searchBST(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            int val,
            @ConvertWith(TreeNodeConverter.class) TreeNode expected
    ) {
        TreeNode actual = solution.searchBST(root, val);
        Assertions.assertEquals(expected, actual);
    }
}
