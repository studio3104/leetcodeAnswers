package com.studio3104.leetcode.Problems.p0815BusRoutes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    List<Set<Integer>> routeSets;
    Map<Integer, Set<Integer>> stops;
    Map<Integer, Set<Integer>> hub;
    Set<Integer> markedStops;
    Set<Integer> markedRoutes;
    int goal;

    public int numBusesToDestination(int[][] routes, int S, int T) {
        if (S == T) return 0;
        goal = T;

        routeSets = new ArrayList<>();
        stops = new HashMap<>();
        for (int i = 0; i < routes.length; ++i) {
            routeSets.add(new HashSet<>());
            for (int stop: routes[i]) {
                stops.putIfAbsent(stop, new HashSet<>());
                stops.get(stop).add(i);
                routeSets.get(i).add(stop);
            }
        }

        hub = new HashMap<>();
        for (Map.Entry<Integer, Set<Integer>> stop: stops.entrySet()) {
            if (stop.getValue().size() < 2) continue;
            for (int s: stop.getValue()) {
                hub.putIfAbsent(s, new HashSet<>());
                hub.get(s).add(stop.getKey());
            }
        }

        markedStops = new HashSet<>();
        markedRoutes = new HashSet<>();
        return countRoutes(S, 1, Integer.MAX_VALUE);
    }

    int countRoutes(int current, int count, int currentMin) {
        if (count >= currentMin) return currentMin;
        markedStops.add(current);

        for (int r: stops.get(current)) {
            if (routeSets.get(r).contains(goal)) return count;
        }

        for (int r: stops.get(current)) {
            if (!markedRoutes.contains(r)) ++count;
            markedRoutes.add(r);
            if (!hub.containsKey(r)) continue;
            for (int hr: hub.get(r)) {
                if (markedStops.contains(hr)) continue;
                currentMin = Math.min(currentMin, countRoutes(hr, count, currentMin));
            }
        }

        return currentMin == Integer.MAX_VALUE ? -1 : currentMin;
    }
}
