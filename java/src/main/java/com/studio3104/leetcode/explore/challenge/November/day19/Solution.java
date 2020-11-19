package com.studio3104.leetcode.explore.challenge.November.day19;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    private int getTimesToRepeat(int p, StringBuilder decoded, int log10, int timesToRepeat) {
        if (p < 0) return timesToRepeat;
        int times = Character.getNumericValue(decoded.charAt(p));
        if (times < 0 || times >= 10) return timesToRepeat;
        timesToRepeat += times * Math.pow(10, log10);
        return getTimesToRepeat(p - 1, decoded, log10 + 1, timesToRepeat);
    }

    public String decodeString(String s) {
        Deque<Integer> parenthesesChecker = new ArrayDeque<>();
        StringBuilder decoded = new StringBuilder(s);
        int i = -1;

        while (++i < decoded.length()) {
            char c = decoded.charAt(i);

            if (c == '[') {
                parenthesesChecker.addLast(i);
                continue;
            }

            if (c != ']') continue;
            if (parenthesesChecker.isEmpty()) throw new RuntimeException();

            int openPointer = parenthesesChecker.pollLast();
            int timesToRepeat = getTimesToRepeat(openPointer - 1, decoded, 0, 0);

            String compressedString = decoded.substring(openPointer + 1, i);
            StringBuilder decompressedString = new StringBuilder();
            decompressedString.append(String.valueOf(compressedString).repeat(timesToRepeat));

            int startPointer = openPointer - 1 - (int) Math.log10(timesToRepeat);
            decoded.replace(startPointer, i + 1, decompressedString.toString());
            i = startPointer + decompressedString.length() - 1;
        }

        return decoded.toString();
    }
}
