package com.studio3104.leetcode.explore.collection.easy.linkedlist.MergeTwoSortedLists;

import com.studio3104.leetcode.structure.ListNode;
import com.studio3104.leetcode.structure.ListNodeConverter;
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
                Arguments.of(
                        new int[]{1, 2, 4}, new int[]{1, 3, 4},
                        new int[]{1, 1, 2, 3, 4, 4}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void mergeTwoLists(
            @ConvertWith(ListNodeConverter.class)ListNode l1,
            @ConvertWith(ListNodeConverter.class)ListNode l2,
            @ConvertWith(ListNodeConverter.class) ListNode expected
    ) {
        ListNode result = solution.mergeTwoLists(l1, l2);
        Assertions.assertEquals(expected, result);
    }
}
