from typing import Dict, List


class LRUCache:
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.recent_keys: List[int] = []
        self._cache: Dict[int, int] = {}

    def get(self, key: int) -> int:
        if key in self.recent_keys:
            self.recent_keys.remove(key)
            self.recent_keys.append(key)

        return self._cache.get(key, -1)

    def put(self, key: int, value: int) -> None:
        if key in self.recent_keys:
            self.recent_keys.remove(key)

        self.recent_keys.append(key)
        self._cache[key] = value

        if len(self.recent_keys) > self.capacity:
            del self._cache[self.recent_keys[0]]
            self.recent_keys = self.recent_keys[self.capacity * -1:]
