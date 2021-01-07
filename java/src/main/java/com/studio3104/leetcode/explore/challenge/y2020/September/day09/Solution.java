package com.studio3104.leetcode.explore.challenge.y2020.September.day09;

import java.util.LinkedList;

public class Solution {
    public int compareVersion(String version1, String version2) {
        LinkedList<Integer> v1List = new LinkedList<>(), v2List = new LinkedList<>();
        for (String v: version1.split("\\.")) v1List.add(Integer.parseInt(v));
        for (String v: version2.split("\\.")) v2List.add(Integer.parseInt(v));

        while (!v1List.isEmpty() || !v2List.isEmpty()) {
            int v1 = v1List.peekFirst() == null ? 0 : v1List.pollFirst();
            int v2 = v2List.peekFirst() == null ? 0 : v2List.pollFirst();
            if (v1 == v2) continue;
            return v1 > v2 ? 1 : -1;
        }

        return 0;
    }
}

