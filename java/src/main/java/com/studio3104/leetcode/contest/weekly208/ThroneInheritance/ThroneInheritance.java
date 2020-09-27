package com.studio3104.leetcode.contest.weekly208.ThroneInheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ThroneInheritance {
    String kingName;
    Set<String> dead = new HashSet<>();
    Map<String, List<String>> childrenOf = new HashMap<>();

    public ThroneInheritance(String kingName) {
        this.kingName = kingName;
        childrenOf.put(kingName, new ArrayList<>());
    }

    public void birth(String parentName, String childName) {
        childrenOf.put(childName, new ArrayList<>());
        childrenOf.get(parentName).add(childName);
    }

    public void death(String name) {
        dead.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        if (!dead.contains(kingName)) order.add(kingName);
        traverse(kingName, order);
        return order;
    }

    void traverse(String parentName, List<String> order) {
        for (String child: childrenOf.get(parentName)) {
            if (!dead.contains(child)) order.add(child);
            traverse(child, order);
        }
    }
}

/*
  Your ThroneInheritance object will be instantiated and called as such:
  ThroneInheritance obj = new ThroneInheritance(kingName);
  obj.birth(parentName,childName);
  obj.death(name);
  List<String> param_3 = obj.getInheritanceOrder();
 */
