package com.studio3104.leetcode.explore.challenge.y2021.January.day12;

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
                Arguments.of(new int[]{2, 4, 3}, new int[]{5, 6, 4}, new int[]{7, 0, 8}),
                Arguments.of(new int[]{0}, new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9}, new int[]{8, 9, 9, 9, 0, 0, 0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void addTwoNumbers(
            @ConvertWith(ListNodeConverter.class) ListNode l1,
            @ConvertWith(ListNodeConverter.class) ListNode l2,
            @ConvertWith(ListNodeConverter.class) ListNode expected
    ) {
        ListNode actual = solution.addTwoNumbers(l1, l2);
        Assertions.assertEquals(expected, actual);
    }
}
