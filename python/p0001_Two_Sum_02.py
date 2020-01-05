from typing import List
import pytest


class _Solution:  # Brute Force (TLE)
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = {i: v for i, v in enumerate(nums)}

        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if hm[i] + hm[j] == target:
                    return [i, j]

        return []


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = {v: i for i, v in enumerate(nums)}

        for i, n in enumerate(nums):
            t = target - n
            if t in hm and i != hm[t]:
                return [i, hm[t]]

        return []


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    (([2, 7, 11, 15], 9), [0, 1]),
    (([3, 2, 4], 6), [1, 2]),
    (([3, 3], 6), [0, 1]),
))
def test_is_valid(input_value: str, expected_result: bool, solution: Solution) -> None:
    assert solution.twoSum(*input_value) == expected_result
