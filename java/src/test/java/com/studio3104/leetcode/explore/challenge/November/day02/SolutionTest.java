package com.studio3104.leetcode.explore.challenge.November.day02;

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
                Arguments.of(new int[]{4, 2, 1, 3}, new int[]{1, 2, 3, 4}),
                Arguments.of(new int[]{-1, 5, 3, 4, 0}, new int[]{-1, 0, 3, 4, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void insertionSortList(
            @ConvertWith(ListNodeConverter.class) ListNode head,
            @ConvertWith(ListNodeConverter.class) ListNode expected
    ) {
        ListNode actual = solution.insertionSortList(head);
        Assertions.assertEquals(expected, actual);
    }
}
