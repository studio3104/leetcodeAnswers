package com.studio3104.leetcode.explore.challenge.y2020.August.day05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordDictionaryTest {
    WordDictionary wordDictionary = new WordDictionary();

    @Test
    void testWordDictionary() {
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        Assertions.assertFalse(wordDictionary.search("pad"));
        Assertions.assertTrue(wordDictionary.search("bad"));
        Assertions.assertTrue(wordDictionary.search(".ad"));
        Assertions.assertTrue(wordDictionary.search("b.."));
    }
}
