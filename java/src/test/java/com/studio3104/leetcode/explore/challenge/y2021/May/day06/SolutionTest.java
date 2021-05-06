package com.studio3104.leetcode.explore.challenge.y2021.May.day06;

import com.studio3104.leetcode.structure.ListNode;
import com.studio3104.leetcode.structure.ListNodeConverter;
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
                Arguments.of(new int[]{-10, -3, 0, 5, 9}, "[0,-3,9,-10,null,5]"),
                Arguments.of(new int[]{}, "[]"),
                Arguments.of(new int[]{0}, "[0]"),
                Arguments.of(new int[]{1, 3}, "[3,1]")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void sortedListToBST(
            @ConvertWith(ListNodeConverter.class) ListNode head,
            @ConvertWith(TreeNodeConverter.class) TreeNode expected
    ) {
        Solution solution = new Solution();
        TreeNode actual = solution.sortedListToBST(head);
        Assertions.assertEquals(expected, actual);
    }
}
