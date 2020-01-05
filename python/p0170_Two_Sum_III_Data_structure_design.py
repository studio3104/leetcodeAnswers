from typing import Dict, List
import pytest


class TwoSum:
    def __init__(self) -> None:
        self.appering_multiple_times: Dict[int, None] = {}
        self.hashmap: Dict[int, int] = {}

    def add(self, number: int) -> None:
        if number in self.hashmap:
            self.appering_multiple_times[number] = None
        self.hashmap[number] = len(self.hashmap) + len(self.appering_multiple_times)

    def find(self, value: int) -> bool:
        for n, i in self.hashmap.items():
            t = value - n
            if t in self.hashmap:
                if i != self.hashmap[t] or t in self.appering_multiple_times:
                    return True

        return False


@pytest.fixture
def twosum() -> TwoSum:
    return TwoSum()


@pytest.mark.parametrize(('to_add', 'to_find', 'expected'), (
    (
        [1, 3, 5],
        [4, 7],
        [True, False],
    ),
    (
        [3, 1, 2],
        [3, 6],
        [True, False],
    ),
))
def test_is_valid(to_add: List[int], to_find: List[int], expected: List[bool], twosum: TwoSum) -> None:
    for ta in to_add:
        twosum.add(ta)

    for i, tf in enumerate(to_find):
        assert twosum.find(tf) is expected[i]
