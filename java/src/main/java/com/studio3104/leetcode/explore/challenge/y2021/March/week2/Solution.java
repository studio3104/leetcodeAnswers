package com.studio3104.leetcode.explore.challenge.y2021.March.week2;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private final Map<Character, Character> strobogrammatic = new HashMap<>() {{
        put('0', '0');
        put('1', '1');
        put('6', '9');
        put('8', '8');
        put('9', '6');
    }};

    public boolean isStrobogrammatic(String num) {
        int head = 0;
        int tail = num.length() - 1;

        while (head <= tail) {
            char c = num.charAt(head);
            if (!strobogrammatic.containsKey(c) || strobogrammatic.get(c) != num.charAt(tail)) {
                return false;
            }
            ++head;
            --tail;
        }

        return true;
    }
}
