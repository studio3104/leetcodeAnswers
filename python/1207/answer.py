from typing import List


class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        c = {}
        for a in arr:
            if a not in c:
                c[a] = 0
            c[a] += 1
        v = c.values()
        return len(v) == len(set(v))
