package com.studio3104.leetcode.Problems.p0922SortArrayByParityII;

import java.util.LinkedList;

public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        LinkedList<Integer> odd = new LinkedList<>();
        LinkedList<Integer> even = new LinkedList<>();
        for (int v : A) {
            if (v % 2 == 0) even.add(v);
            else odd.add(v);
        }

        int[] result = new int[A.length];
        for (int i = 0; i < A.length; ++i) {
            result[i] = i % 2 == 0 ? even.pollFirst() : odd.pollFirst();
        }

        return result;
    }
}
