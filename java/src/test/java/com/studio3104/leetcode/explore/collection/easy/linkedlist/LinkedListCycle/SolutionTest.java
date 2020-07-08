package com.studio3104.leetcode.explore.collection.easy.linkedlist.LinkedListCycle;

import com.studio3104.leetcode.structure.ListNode;
import com.studio3104.leetcode.structure.ListNodeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

// Need to disable `lombok.EqualsAndHashCode` from `ListNode` class in order to pass test
class SolutionTest {
    Solution solution = new Solution();

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
            @ConvertWith(ListNodeConverter.class) ListNode head, int pos,
            boolean expected
    ) {
        if (pos != -1) {
            ListNode current = head;
            ListNode loopTo = null;
            int index = 0;
            while (true) {
                if (index++ == pos) loopTo = current;
                if (current.next == null) {
                    current.next = loopTo;
                    break;
                }
                current = current.next;
            }
        }

        boolean result = solution.hasCycle(head);
        Assertions.assertEquals(expected, result);
    }
}