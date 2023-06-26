import math


class Solution:
    def countOdds(self, low: int, high: int) -> int:
        c = math.floor((high - low) / 2)
        if low % 2 != 0 or high % 2 != 0:
            return c + 1
        return c
