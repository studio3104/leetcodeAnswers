package com.studio3104.leetcode.explore.collection.medium.LinkedList.IntersectionOfTwoLinkedList;

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
                Arguments.of(new int[]{4, 2}, new int[]{5, 6, 1}, new int[]{8, 4, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void getIntersectionNode(
            @ConvertWith(ListNodeConverter.class)ListNode headA,
            @ConvertWith(ListNodeConverter.class)ListNode headB,
            @ConvertWith(ListNodeConverter.class)ListNode expected
    ) {
        ListNode A = headA, B = headB;
        while (A.next != null) A = A.next;
        while (B.next != null) B = B.next;
        A.next = expected; B.next = expected;

        ListNode result = solution.getIntersectionNode(headA, headB);
        Assertions.assertEquals(expected, result);
    }
}
