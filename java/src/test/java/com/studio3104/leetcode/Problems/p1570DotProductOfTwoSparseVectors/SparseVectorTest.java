package com.studio3104.leetcode.Problems.p1570DotProductOfTwoSparseVectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SparseVectorTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 0, 2, 3}, new int[]{0, 3, 0, 4, 0}, 8),
                Arguments.of(new int[]{0, 1, 0, 0, 0}, new int[]{0, 0, 0, 0, 2}, 0),
                Arguments.of(new int[]{0, 1, 0, 0, 2, 0, 0}, new int[]{1, 0, 0, 0, 3, 0, 4}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void dotProduct(int[] nums1, int[] nums2,  int expected) {
        SparseVector sv1 = new SparseVector(nums1);
        SparseVector sv2 = new SparseVector(nums2);

        int actual = sv1.dotProduct(sv2);
        Assertions.assertEquals(expected, actual);
    }
}
