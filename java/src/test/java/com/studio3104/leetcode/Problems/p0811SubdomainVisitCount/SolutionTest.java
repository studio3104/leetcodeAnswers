package com.studio3104.leetcode.Problems.p0811SubdomainVisitCount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new String[]{"9001 discuss.leetcode.com"},
                        List.of("9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com")
                ),
                Arguments.of(
                        new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"},
                        List.of("901 mail.com", "50 yahoo.com", "900 google.mail.com", "5 wiki.org", "5 org", "1 intel.mail.com", "951 com")
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void subdomainVisits(String[] cpdomains, List<String> expected) {
        List<String> result = solution.subdomainVisits(cpdomains);
        Assertions.assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }
}
