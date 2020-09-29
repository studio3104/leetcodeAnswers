package com.studio3104.leetcode.explore.challenge.September.day29;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Trie {
    Map<Character, Trie> children = new HashMap<>();
    boolean isWord = false;

    void insert(String word) {
        Trie current = this;
        for (char c: word.toCharArray()) {
            current.children.putIfAbsent(c, new Trie());
            current = current.children.get(c);
        }
        current.isWord = true;
    }
}

public class Solution {
    String string;
    Trie rootTrie;

    private boolean canBeSegmented(int p, Trie trie) {
        if (p >= string.length()) return false;

        char c = string.charAt(p);
        if (!trie.children.containsKey(c)) return false;

        trie = trie.children.get(c);
        if (trie.isWord) {
            if (p == string.length() - 1) return true;
            return canBeSegmented(p + 1, rootTrie) || canBeSegmented(p + 1, trie);
        } else {
            return canBeSegmented(p + 1, trie);
        }
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        string = s;
        rootTrie = new Trie();
        for (String word: wordDict) rootTrie.insert(word);
        return canBeSegmented(0, rootTrie);
    }
}
