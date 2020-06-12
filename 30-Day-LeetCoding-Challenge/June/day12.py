from typing import Dict, List, Set

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


class RandomizedSetWithoutBuildInSet:
    def __init__(self) -> None:
        self.array: List[int] = []
        self.hashmap: Dict[int, int] = {}

    def insert(self, val: int) -> bool:
        if val in self.hashmap:
            return False
        self.hashmap[val] = len(self.array)
        self.array.append(val)
        return True

    def remove(self, val: int) -> bool:
        if val not in self.hashmap:
            return False

        e, i = self.array[-1], self.hashmap[val]
        self.array[i], self.hashmap[e] = e, i

        self.array.pop()
        del(self.hashmap[val])

        return True

    def getRandom(self) -> int:
        return random.choice(self.array)
