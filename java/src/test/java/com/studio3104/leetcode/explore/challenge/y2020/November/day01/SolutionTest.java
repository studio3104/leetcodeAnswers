package com.studio3104.leetcode.explore.challenge.y2020.November.day01;

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
                Arguments.of(new int[]{1, 0, 1}, 5),
                Arguments.of(new int[]{0}, 0),
                Arguments.of(new int[]{1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, 18880),
                Arguments.of(new int[]{0, 0}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void getDecimalValue(
            @ConvertWith(ListNodeConverter.class) ListNode head,
            int expected
    ) {
        int actual = solution.getDecimalValue(head);
        Assertions.assertEquals(expected, actual);
    }
}
