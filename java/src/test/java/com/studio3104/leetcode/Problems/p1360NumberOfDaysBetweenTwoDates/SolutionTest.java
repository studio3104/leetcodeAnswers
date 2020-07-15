package com.studio3104.leetcode.Problems.p1360NumberOfDaysBetweenTwoDates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "2019-06-29, 2019-06-30, 1",
            "2020-01-15, 2019-12-31, 15"
    })
    void daysBetweenDates(String date1, String date2, int expected) {
        int result = solution.daysBetweenDates(date1, date2);
        Assertions.assertEquals(expected, result);
    }
}
