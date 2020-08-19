package com.studio3104.leetcode.explore.challenge.August.day19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "I speak Goat Latin, Imaa peaksmaaa oatGmaaaa atinLmaaaaa",
            "The quick brown fox jumped over the lazy dog, heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
    })
    void toGoatLatin(String S, String expected) {
        String result = solution.toGoatLatin(S);
        Assertions.assertEquals(expected, result);
    }
}
