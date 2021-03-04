package com.studio3104.leetcode.explore.challenge.y2021.March.day04;

import com.studio3104.leetcode.structure.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static class Parameters {
        final ListNode headA;
        final ListNode headB;
        final ListNode expected;

        Parameters(int[] listA, int[] listB, int skipA, int skipB) {
            ListNode pseudoA = new ListNode();
            ListNode pseudoB = new ListNode();
            ListNode intersection = null;

            ListNode currentA = pseudoA;
            for (int n : listA) {
                currentA.next = new ListNode(n);
                currentA = currentA.next;

                if (skipA-- == 0) {
                    intersection = currentA;
                }
            }

            ListNode currentB = pseudoB;
            for (int i = 0; skipB-- > 0; ++i) {
                currentB.next = new ListNode(listB[i]);
                currentB = currentB.next;
            }
            currentB.next = intersection;

            headA = pseudoA.next;
            headB = pseudoB.next;
            expected = intersection;
        }
    }

    static Stream<Parameters> argumentsProvider() {
        return Stream.of(
                new Parameters(new int[]{4, 1, 8, 4, 5}, new int[]{5, 6, 1, 8, 4, 5}, 2, 3),
                new Parameters(new int[]{1, 9, 1, 2, 4}, new int[]{3, 2, 4}, 3, 1),
                new Parameters(new int[]{2, 6, 4}, new int[]{1, 5}, 3, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void getIntersectionNode(Parameters p) {
        Solution solution = new Solution();
        ListNode actual = solution.getIntersectionNode(p.headA, p.headB);
        Assertions.assertEquals(p.expected, actual);
    }
}
