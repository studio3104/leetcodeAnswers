package com.studio3104.leetcode.explore.challenge.y2021.February.day03;

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
                Arguments.of(new int[]{3, 2, 0, -4}, 1, true),
                Arguments.of(new int[]{1, 2}, 0, true),
                Arguments.of(new int[]{1}, -1, false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void hasCycle(
            @ConvertWith(ListNodeConverter.class) ListNode head,
            int pos,
            boolean expected
    ) {
        Solution solution = new Solution();

        if (pos >= 0) {
            ListNode current = head;
            ListNode connectTo = null;

            while (current.next != null) {
                if (pos--  == 0) {
                    connectTo = current;
                }
                current = current.next;
            }

            current.next = connectTo;
        }

        boolean actual = solution.hasCycle(head);
        Assertions.assertEquals(expected, actual);
    }
}
