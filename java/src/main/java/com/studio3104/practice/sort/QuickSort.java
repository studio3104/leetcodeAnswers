package com.studio3104.practice.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static List<Integer> sort(List<Integer> list) {
        if (list.size() <= 1) return list;

        int pivotIndex = list.size() / 2;
        int pivot = list.get(pivotIndex);

        List<Integer> lower = new ArrayList<>();
        List<Integer> higher = new ArrayList<>();

        for (int i = 0; i < list.size(); ++i) {
            if (i == pivotIndex) continue;
            int e = list.get(i);
            if (e > pivot) higher.add(e);
            else lower.add(e);
        }

        List<Integer> sorted = new ArrayList<>(sort(lower));
        sorted.add(pivot); sorted.addAll(sort(higher));
        return sorted;
    }
}
