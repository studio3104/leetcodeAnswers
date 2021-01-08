package com.studio3104.leetcode.explore.challenge.y2021.January.week2;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
        children = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    public Node(int _val, ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
}
