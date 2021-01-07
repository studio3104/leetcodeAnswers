package com.studio3104.leetcode.explore.challenge.y2020.October.day07;

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
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 2, new int[]{4, 5, 1, 2, 3}),
                Arguments.of(new int[]{0, 1, 2}, 4, new int[]{2, 0, 1}),
                Arguments.of(new int[]{1, 2}, 1, new int[]{2, 1}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 10, new int[]{1, 2, 3, 4, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void rotateRight(
            @ConvertWith(ListNodeConverter.class) ListNode head,
            int k,
            @ConvertWith(ListNodeConverter.class) ListNode expected
    ) {
        ListNode result = solution.rotateRight(head, k);
        Assertions.assertEquals(expected, result);
    }
}
