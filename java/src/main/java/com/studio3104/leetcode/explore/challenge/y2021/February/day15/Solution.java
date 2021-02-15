package com.studio3104.leetcode.explore.challenge.y2021.February.day15;

import java.util.PriorityQueue;

class Solution {
    private int countOne(int[] nums, int head, int tail) {
        if (head >= tail) {
            return 0;
        }
        int p = head + (tail - head) / 2;

        if (nums[p] == 0) {
            return countOne(nums, head, p);
        }

        int n = p + 1;
        if (n >= nums.length) {
            return nums.length;
        }

        return nums[n] == 0 ? n : countOne(nums, n, tail);
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? b[1] - a[1] : b[0] - a[0]);

        for (int i = 0; i < mat.length; ++i) {
            pq.add(new int[]{countOne(mat[i], 0, mat[i].length), i});
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] indexes = new int[k];

        while (!pq.isEmpty()) {
            indexes[--k] = pq.poll()[1];
        }

        return indexes;
    }
}
