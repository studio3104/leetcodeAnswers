package com.studio3104.leetcode.explore.challenge.August.day23;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isWord = false;

    void insertReverse(String word) {
        TrieNode current = this;
        for (char c: new StringBuilder(word).reverse().toString().toCharArray()) {
            current.children.putIfAbsent(c, new TrieNode());
            current = current.children.get(c);
        }
        current.isWord = true;
    }
}

public class StreamChecker {
    TrieNode trie;
    LinkedList<Character> history;

    public StreamChecker(String[] words) {
        trie = new TrieNode();
        history = new LinkedList<>();
        for (String word: words) trie.insertReverse(word);
    }

    public boolean query(char letter) {
        history.addFirst(letter);
        TrieNode current = trie;

        for (char c: history) {
            if (current.isWord) return true;
            if (!current.children.containsKey(c)) return false;
            current = current.children.get(c);
        }
        return current.isWord;
    }
}
