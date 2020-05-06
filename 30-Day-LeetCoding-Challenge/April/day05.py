from typing import List

import pytest


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        gain: int = 0

        for i in range(1, len(prices)):
            _gain = prices[i] - prices[i - 1]
            if _gain > 0:
                gain += _gain

        return gain


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('maxProfit', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([7, 1, 5, 3, 6, 4], 7),
        ([1, 2, 3, 4, 5], 4),
        ([7, 6, 4, 3, 1], 0),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
