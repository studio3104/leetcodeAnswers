package com.studio3104.leetcode.explore.challenge.y2021.May.week3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

class Solution {
    private final int[][] DIRECTIONS = new int[][]{{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};

    private static class Position {
        final int x;
        final int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Position)) return false;
            final Position other = (Position) o;
            if (!other.canEqual(this)) return false;
            if (this.x != other.x) return false;
            return this.y == other.y;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Position;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = result * PRIME + this.x;
            result = result * PRIME + this.y;
            return result;
        }
    }

    public int minKnightMoves(int x, int y) {
        Position target = new Position(Math.abs(x), Math.abs(y));

        Deque<Position> queue = new ArrayDeque<>();
        Position initial = new Position(0, 0);
        queue.add(initial);

        Set<Position> visited = new HashSet<>();

        int result = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; ++i) {
                Position current = queue.pollFirst();

                if (current == null || visited.contains(current)) {
                    continue;
                }

                if (current.equals(target)) {
                    return result;
                }

                visited.add(current);

                for (int[] d : DIRECTIONS) {
                    Position next = new Position(current.x + d[0], current.y + d[1]);
                    if (visited.contains(next) || next.x < -1 || next.y < -1) {
                        continue;
                    }
                    queue.add(next);
                }
            }

            ++result;
        }

        return -1;
    }
}
