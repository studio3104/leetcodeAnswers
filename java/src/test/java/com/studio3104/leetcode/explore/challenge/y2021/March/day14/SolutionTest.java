package com.studio3104.leetcode.explore.challenge.y2021.March.day14;

import com.studio3104.leetcode.structure.ListNode;
import com.studio3104.leetcode.structure.ListNodeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 2, new int[]{1, 4, 3, 2, 5}),
                Arguments.of(new int[]{7, 9, 6, 6, 7, 8, 3, 0, 9, 5}, 5, new int[]{7, 9, 6, 6, 8, 7, 3, 0, 9, 5}),
                Arguments.of(new int[]{1}, 1, new int[]{1}),
                Arguments.of(new int[]{1, 2}, 1, new int[]{2, 1}),
                Arguments.of(new int[]{1, 2, 3}, 2, new int[]{1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void swapNodes(
            @ConvertWith(ListNodeConverter.class) ListNode head,
            int k,
            @ConvertWith(ListNodeConverter.class) ListNode expected
    ) {
        Solution solution = new Solution();
        ListNode actual = solution.swapNodes(head, k);
        Assertions.assertEquals(expected, actual);
    }
}
