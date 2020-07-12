package com.studio3104.leetcode.Problems.p0811SubdomainVisitCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counter = new HashMap<>();

        for (String cpdomain: cpdomains) {
            String[] cpd = cpdomain.split(" ");

            int c = Integer.parseInt(cpd[0]);
            String[] domains = cpd[1].split("\\.");

            String d = "";
            for (int i = domains.length - 1; i >= 0; i--) {
                if (i == domains.length - 1) d = domains[i];
                else d = domains[i] + "." + d;
                counter.put(d, counter.getOrDefault(d, 0) + c);
            }
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: counter.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }

        return result;
    }
}
