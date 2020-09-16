package com.studio3104.leetcode.explore.challenge.September.day16;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();

    void insert(String word) {
        TrieNode current = this;
        for (char c: word.toCharArray()) {
            current.children.putIfAbsent(c, new TrieNode());
            current = current.children.get(c);
        }
    }
}

public class Solution {
    private int findMaximumXOR(TrieNode trie, String binary, int depth, StringBuilder sb) {
        if (depth >= binary.length()) return Integer.parseInt(sb.toString(), 2);

        char bit = binary.charAt(depth);
        char opposite = bit == '1' ? '0' : '1';
        TrieNode next;

        if (trie.children.containsKey(opposite)) {
            sb.append("1");
            next = trie.children.get(opposite);
        } else {
            sb.append("0");
            next = trie.children.get(bit);
        }

        return findMaximumXOR(next, binary, depth + 1, sb);
    }

    public int findMaximumXOR(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        for (int num: nums) maxNum = Math.max(maxNum, num);
        int depth = Integer.toBinaryString(maxNum).length();

        TrieNode trie = new TrieNode();
        String[] paddedBinaries = new String[nums.length];
        int bitmask = 1 << depth;

        for (int i = 0; i < nums.length; ++i) {
            paddedBinaries[i] = Integer.toBinaryString(bitmask | nums[i]).substring(1);
        }

        int maxXOR = Integer.MIN_VALUE;

        for (String paddedBinary: paddedBinaries) {
            trie.insert(paddedBinary);
            int current = findMaximumXOR(trie, paddedBinary, 0, new StringBuilder());
            maxXOR = Math.max(maxXOR, current);
        }

        return maxXOR;
    }
}
