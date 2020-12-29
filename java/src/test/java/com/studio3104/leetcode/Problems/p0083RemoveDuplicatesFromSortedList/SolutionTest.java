package com.studio3104.leetcode.Problems.p0083RemoveDuplicatesFromSortedList;

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
                Arguments.of(new int[]{1, 1, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{1, 1, 2, 3, 3}, new int[]{1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void deleteDuplicates(
            @ConvertWith(ListNodeConverter.class) ListNode head,
            @ConvertWith(ListNodeConverter.class) ListNode expected
    ) {
        ListNode actual = solution.deleteDuplicates(head);
        Assertions.assertEquals(expected, actual);
    }
}
