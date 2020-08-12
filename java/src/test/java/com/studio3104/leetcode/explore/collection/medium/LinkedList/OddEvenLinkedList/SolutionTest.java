package com.studio3104.leetcode.explore.collection.medium.LinkedList.OddEvenLinkedList;

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
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{1, 3, 5, 2, 4}),
                Arguments.of(new int[]{2, 1, 3, 5, 6, 4, 7}, new int[]{2, 3, 6, 7, 1, 5, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void oddEvenList(
            @ConvertWith(ListNodeConverter.class) ListNode head,
            @ConvertWith(ListNodeConverter.class) ListNode expected
    ) {
        ListNode result = solution.oddEvenList(head);
        Assertions.assertEquals(expected, result);
    }
}
