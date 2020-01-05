from typing import List
import pytest


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = {v: i for i, v in enumerate(nums)}

        for i, n in enumerate(nums):
            t = target - n
            if t in hm and i != hm[t]:
                return [i + 1, hm[t] + 1]

        return []


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    (([2, 7, 11, 15], 9), [1, 2]),
    (([3, 2, 4], 6), [2, 3]),
    (([3, 3], 6), [1, 2]),
))
def test_is_valid(input_value: str, expected_result: bool, solution: Solution) -> None:
    assert solution.twoSum(*input_value) == expected_result
