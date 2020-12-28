package com.studio3104.leetcode.Problems.p0692TopKFrequentWords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> counter = new HashMap<>();
        for (String word : words) {
            counter.put(word, counter.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> heap = new PriorityQueue<>((w1, w2) -> {
            if (Objects.equals(counter.get(w1), counter.get(w2))) {
                return w2.compareTo(w1);
            } else {
                return counter.get(w1) - counter.get(w2);
            }
        });

        for (String word : counter.keySet()) {
            heap.add(word);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        List<String> result = new ArrayList<>();
        while (!heap.isEmpty()) {
            result.add(heap.poll());
        }
        Collections.reverse(result);

        return result;
    }
}
