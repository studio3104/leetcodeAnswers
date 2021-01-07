package com.studio3104.leetcode.explore.challenge.y2020.August.day21;

import java.util.LinkedList;

public class Solution {
    public int[] sortArrayByParity(int[] A) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int n: A) {
            if (n % 2 == 0) l.addFirst(n);
            else l.addLast(n);
        }
        return l.stream().mapToInt(i->i).toArray();
    }
}
