package com.studio3104.leetcode.explore.challenge.y2020.August.day26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(15, new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void fizzBuzz(int n, String[] expected) {
        List<String> result = solution.fizzBuzz(n);
        Assertions.assertArrayEquals(expected, result.toArray());
    }
}
