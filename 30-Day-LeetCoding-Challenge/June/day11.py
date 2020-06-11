from typing import Dict, List

import pytest


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        counter: Dict[int, int] = {i: 0 for i in range(min(nums), max(nums) + 1)}
        for n in nums:
            counter[n] += 1

        current = min(nums)
        for i in range(len(nums)):
            while counter[current] == 0:
                current += 1
            nums[i] = current
            counter[current] -= 1


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('sortColors', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([2, 0, 2, 1, 1, 0], [0, 0, 1, 1, 2, 2]),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: List[int]) -> None:

        getattr(solution, method_name)(input_value)
        input_value == expected_value
