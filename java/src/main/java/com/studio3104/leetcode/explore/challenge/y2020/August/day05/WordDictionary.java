package com.studio3104.leetcode.explore.challenge.y2020.August.day05;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isWord = false;

    void insert(String word) {
        TrieNode current = this;
        for (char c: word.toCharArray()) {
            current.children.putIfAbsent(c, new TrieNode());
            current = current.children.get(c);
        }
        current.isWord = true;
    }
}

class WordDictionary {
    TrieNode trie = new TrieNode();

    /** Initialize your data structure here. */
    public WordDictionary() {}

    /** Adds a word into the data structure. */
    public void addWord(String word) { trie.insert(word); }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) { return search(word, trie); }

    private boolean search(String word, TrieNode node) {
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            if (c == '.') {
                for (char x : node.children.keySet()) {
                    if (search(word.substring(i + 1), node.children.get(x))) return true;
                }
                return false;
            }

            if (!node.children.containsKey(c)) return false;
            node = node.children.get(c);
        }

        return node.isWord;
    }
}
