package com.studio3104.leetcode.explore.challenge.y2021.February.day05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "/home/, /home",
            "/../, /",
            "/home//foo, /home/foo",
            "/a/./b/../../c/, /c",
            "/a/./b///../c/../././../d/..//../e/./f/./g/././//.//h///././/..///, /e/f/g",
    })
    void simplifyPath(String path, String expected) {
        Solution solution = new Solution();
        String actual = solution.simplifyPath(path);
        Assertions.assertEquals(expected, actual);
    }
}
