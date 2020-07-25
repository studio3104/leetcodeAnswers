package com.studio3104.practice.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class QuickSortTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        List.of(3, 5, 2, 6, 4, 1, 0),
                        List.of(0, 1, 2, 3, 4, 5, 6)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void sort(List<Integer> list, List<Integer> expected) {
        List<Integer> result = QuickSort.sort(list);
        Assertions.assertEquals(expected, result);
    }
}
