package com.studio3104.leetcode.explore.challenge.y2021.March.day06;

import java.util.HashMap;
import java.util.Map;

class Trie {
    Trie[] children;
    int count;

    Trie() {
        children = new Trie[26];
        count = 0;
    }

    public Trie get(char c) {
        if (children[c - 'a'] == null) {
            children[c - 'a'] = new Trie();
            ++count;
        }
        return children[c - 'a'];
    }
}

class Solution {
    public int minimumLengthEncoding(String[] words) {
        Trie trie = new Trie();
        Map<Trie, Integer> nodes = new HashMap<>();

        for (int i = 0; i < words.length; ++i) {
            String word = words[i];
            Trie current = trie;
            for (int j = word.length() - 1; j >= 0; --j) {
                current = current.get(word.charAt(j));
            }
            nodes.put(current, i);
        }

        int answer = 0;
        for (Trie node : nodes.keySet()) {
            if (node.count == 0) {
                answer += words[nodes.get(node)].length() + 1;
            }
        }
        return answer;

    }
}
