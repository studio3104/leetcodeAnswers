package com.studio3104.leetcode.explore.challenge.y2021.May.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int countPrimes(int n) {
        if (n == 0) {
            return 0;
        }

        List<Integer> primes = new ArrayList<>();

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 0; i <= n; ++i) {
            if (!isPrime[i]) {
                continue;
            }

            primes.add(i);

            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        return primes.size();
    }
}
