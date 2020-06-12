from typing import Set

import random


class RandomizedSet:
    def __init__(self) -> None:
        self.data: Set[int] = set()

    def insert(self, val: int) -> bool:
        if val in self.data:
            return False
        self.data.add(val)
        return True

    def remove(self, val: int) -> bool:
        if val not in self.data:
            return False
        self.data.remove(val)
        return True

    def getRandom(self) -> int:
        return random.sample(self.data, 1)[0]
