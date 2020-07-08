package com.studio3104.leetcode.explore.collection.easy.linkedlist.PalindromeLinkedList;

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
                Arguments.of(new int[]{1, 2}, false),
                Arguments.of(new int[]{1, 2, 2, 1}, true),
                Arguments.of(new int[]{-129, -129}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void isPalindrome(
            @ConvertWith(ListNodeConverter.class) ListNode head,
            boolean expected
    ) {
        boolean result = solution.isPalindrome(head);
        Assertions.assertEquals(expected, result);
    }
}