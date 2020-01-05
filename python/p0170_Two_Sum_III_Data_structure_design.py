from typing import Dict, List
import pytest


class TwoSum:
    def __init__(self) -> None:
        """
        Initialize your data structure here.
        """
        self.nums: List[int] = []
        self.hashmap: Dict[int, int] = {}

    def add(self, number: int) -> None:
        """
        Add the number to an internal data structure..
        """
        self.nums.append(number)
        self.hashmap[number] = len(self.nums) - 1

    def find(self, value: int) -> bool:
        """
        Find if there exists any pair of numbers which sum is equal to the value.
        """
        for i, n in enumerate(self.nums):
            t = value - n
            if t in self.hashmap and i != self.hashmap[t]:
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
