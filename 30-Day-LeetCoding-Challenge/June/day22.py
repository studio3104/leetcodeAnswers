from typing import List

from collections import Counter

import pytest


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        counter: Counter = Counter(nums)
        for num, times in counter.items():
            if times == 1:
                return num

    def singleNumber2(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            if nums.count(nums[i]) == 1:
                return nums[i]

    def singleNumber3(self, nums: List[int]) -> int:
        once = 0
        twice = 0

        for num in nums:
            once = ~twice & (once ^ num)
            twice = ~once & (twice ^ num)

        return once


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('singleNumber', 'singleNumber2', 'singleNumber3'))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([2, 2, 3, 2], 3),
        ([0, 1, 0, 1, 0, 1, 99], 99),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
