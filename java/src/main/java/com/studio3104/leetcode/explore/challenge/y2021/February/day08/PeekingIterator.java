package com.studio3104.leetcode.explore.challenge.y2021.February.day08;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    private final Iterator<Integer> iterator;
    private Integer peeked = null;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (peeked == null) {
            peeked = iterator.next();
        }
        return peeked;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (peeked == null) {
            return iterator.next();
        }
        Integer nextElement = peeked;
        peeked = null;
        return nextElement;
    }

    @Override
    public boolean hasNext() {
        return peeked != null || iterator.hasNext();
    }
}
