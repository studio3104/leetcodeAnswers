package com.studio3104.leetcode.explore.challenge.y2020.September.day27;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    Map<String, Map<String, Double>> graph;

    private double backtrack(String currentNode, String targetNode, double accProduct, Set<String> visited) {
        visited.add(currentNode);
        double result = -1.0;

        Map<String, Double> neighbors = graph.get(currentNode);
        if (neighbors.containsKey(targetNode)) {
            result = accProduct * neighbors.get(targetNode);
        } else {
            for (Map.Entry<String, Double> pair : neighbors.entrySet()) {
                String nextNode = pair.getKey();
                if (visited.contains(nextNode)) continue;
                result = backtrack(nextNode, targetNode, accProduct * pair.getValue(), visited);
                if (result != -1.0) break;
            }
        }

        visited.remove(currentNode);
        return result;
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        graph = new HashMap<>();

        for (int i = 0; i < values.length; ++i) {
            List<String> equation = equations.get(i);
            String dividend = equation.get(0);
            String divisor = equation.get(1);
            double quotient = values[i];

            graph.putIfAbsent(dividend, new HashMap<>());
            graph.putIfAbsent(divisor, new HashMap<>());
            graph.get(dividend).put(divisor, quotient);
            graph.get(divisor).put(dividend, 1 / quotient);
        }

        double[] result = new double[queries.size()];

        for (int i = 0; i < queries.size(); ++i) {
            List<String> query = queries.get(i);
            String dividend = query.get(0);
            String divisor = query.get(1);

            if (!graph.containsKey(dividend) || !graph.containsKey(divisor)) result[i] = -1.0;
            else if (dividend.equals(divisor)) result[i] = 1.0;
            else {
                HashSet<String> visited = new HashSet<>();
                result[i] = backtrack(dividend, divisor, 1, visited);
            }
        }

        return result;
    }
}
