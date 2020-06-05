from typing import List

import random


class TLESolution:
    def __init__(self, w: List[int]):
        self.c = []
        for i, n in enumerate(w):
            self.c += [i] * n

    def pickIndex(self) -> int:
        return random.choice(self.c)


class Solution:
    def __init__(self, w: List[int]):
        self.c = []
        self.s = 0
        for n in w:
            self.s += n
            self.c.append(self.s)

    def pickIndex(self) -> int:
        t = random.random() * self.s
        ans = -1
        for i, n in enumerate(self.c):
            if t < n:
                ans = i
                break
        return ans
