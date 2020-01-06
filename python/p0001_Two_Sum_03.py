from typing import Dict, List, Tuple
import pytest


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm: Dict[int, int] = {}

        for i, n in enumerate(nums):
            t = target - n

            if t in hm:
                return [i, hm[t]]

            hm[n] = i

        return []


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    (([2, 7, 11, 15], 9), [0, 1]),
    (([3, 2, 4], 6), [1, 2]),
    (([3, 3], 6), [0, 1]),
))
def test_is_valid(input_value: Tuple[List[int], int], expected_result: List[int], solution: Solution) -> None:
    assert sorted(solution.twoSum(*input_value)) == sorted(expected_result)
