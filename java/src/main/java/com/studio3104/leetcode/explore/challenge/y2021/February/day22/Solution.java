package com.studio3104.leetcode.explore.challenge.y2021.February.day22;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Trie {
    Map<Character, Trie> children = new HashMap<>();
    String word = null;

    void insert(String word) {
        Trie current = this;
        for (char c : word.toCharArray()) {
            current.children.putIfAbsent(c, new Trie());
            current = current.children.get(c);
        }
        current.word = word;
    }
}

class Solution {
    private void sortList(List<String> d) {
        d.sort((a, b) -> {
            int diff = a.length() - b.length();
            if (diff != 0) {
                return diff * -1;
            }
            for (int i = 0; i < a.length(); ++i) {
                diff = a.charAt(i) - b.charAt(i);
                if (diff != 0) {
                    return diff;
                }
            }
            return 0;
        });
    }

    private void findWord(String s, int p, Trie trie, Set<String> matches) {
        if (p >= s.length() || trie == null) {
            return;
        }
        if (trie.word != null) {
            matches.add(trie.word);
        }

        char c = s.charAt(p);
        findWord(s, p + 1, trie, matches);
        if (trie.children.containsKey(c)) {
            findWord(s, p + 1, trie.children.get(c), matches);
        }
    }

    public String findLongestWord(String s, List<String> d) {
        // Construct a prefix tree of the input words (`d`)
        Trie trie = new Trie();
        for (String str : d) {
            trie.insert(str);
        }

        // Traverse the prefix tree according to the order of the input string (`s`)
        // If the word is found, add it to a set
        Set<String> matches = new HashSet<>();
        findWord(s, 0, trie, matches);

        // Sort the input words (`d`)
        //    a. Length (desc)
        //    b. Lexicographical
        sortList(d);

        for (String str : d) {
            if (matches.contains(str)) {
                return str;
            }
        }

        return "";
    }
}
