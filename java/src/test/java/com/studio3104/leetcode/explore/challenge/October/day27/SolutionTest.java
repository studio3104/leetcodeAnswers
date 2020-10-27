package com.studio3104.leetcode.explore.challenge.October.day27;

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
                Arguments.of(new int[]{3, 2, 0, -4}, 1),
                Arguments.of(new int[]{1, 2}, 0),
                Arguments.of(new int[]{1}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void detectCycle(
            @ConvertWith(ListNodeConverter.class) ListNode head,
            int pos
    ) {
        if (pos == -1) {
            Assertions.assertNull(solution.detectCycle(head));
        }

        ListNode cycleTo = head;
        ListNode current = head;

        while (current.next != null) {
            if (pos-- == 0) {
                cycleTo = current;
            }

            current = current.next;
        }

        current.next = cycleTo;

        ListNode result = solution.detectCycle(head);
        Assertions.assertEquals(cycleTo, result);
    }
}
