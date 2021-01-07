package com.studio3104.leetcode.explore.challenge.y2020.August.day13;

import java.util.LinkedList;

class CombinationIterator {
    LinkedList<String> combinations = new LinkedList<>();

    public CombinationIterator(String characters, int combinationLength) {
        for (int bitmask = 0; bitmask < 1 << characters.length(); ++bitmask) {
            if (Integer.bitCount(bitmask) != combinationLength) continue;

            StringBuilder current = new StringBuilder();
            for (int i = 0; i < characters.length(); ++i) {
                if ((bitmask & (1 << characters.length() - i - 1)) != 0) {
                    current.append(characters.charAt(i));
                }
            }
            combinations.addFirst(current.toString());
        }
    }

    public String next() {
        return combinations.pollFirst();
    }

    public boolean hasNext() {
        return !combinations.isEmpty();
    }
}

/*
  Your CombinationIterator object will be instantiated and called as such:
  CombinationIterator obj = new CombinationIterator(characters, combinationLength);
  String param_1 = obj.next();
  boolean param_2 = obj.hasNext();
 */
