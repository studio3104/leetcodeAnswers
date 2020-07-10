package com.studio3104.leetcode.explore.collection.easy.tree.ConvertSortedArrayToBinarySearchTree;

import com.studio3104.leetcode.structure.TreeNode;
import com.studio3104.leetcode.structure.TreeNodeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{-10, -3, 0, 5, 9},
                        "[0,-3,9,-10,null,5]"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void sortedArrayToBST(int[] nums, @ConvertWith(TreeNodeConverter.class) TreeNode expected) {
        TreeNode result = solution.sortedArrayToBST(nums);
        Assertions.assertEquals(expected, result);
    }
}