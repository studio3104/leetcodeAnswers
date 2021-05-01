package com.studio3104.leetcode.explore.challenge.y2021.May.day01;

import java.util.HashMap;
import java.util.Map;

class Trie {
    Map<Character, Trie> children = new HashMap<>();
    int index = -1;

    void insert(String  word, int index) {
        Trie current = this;
        for (char c : word.toCharArray()) {
            current.children.putIfAbsent(c, new Trie());
            current.index = Math.max(index, current.index);
            current = current.children.get(c);
        }
    }
}

class WordFilter {
    private final Trie trie = new Trie();

    public WordFilter(String[] words) {
        for (int i = 0; i < words.length; ++i) {
            String tail = "#" + words[i] + "$";
            trie.insert(tail, i);

            StringBuilder suffix = new StringBuilder();

            for (char c : new StringBuilder(words[i]).reverse().toString().toCharArray()) {
                suffix.insert(0, c);
                trie.insert(suffix.toString() + tail, i);
            }
        }
    }

    public int f(String prefix, String suffix) {
        Trie current = trie;
        String word = suffix + "#" + prefix;

        for (char c : word.toCharArray()) {
            if (!current.children.containsKey(c)) {
                return -1;
            }
            current = current.children.get(c);
        }

        return current.index;
    }
}
