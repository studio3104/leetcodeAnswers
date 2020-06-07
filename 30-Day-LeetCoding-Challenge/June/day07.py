from typing import List, Tuple

import pytest


class Solution:
    def change(self, amount: int, coins: List[int]) -> int:
        pass


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('change', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ((5, [1, 2, 5]), 4),
        ((3, [2]), 0),
        ((10, [10]), 1),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: Tuple[int, List[int]], expected_value: int) -> None:

        assert getattr(solution, method_name)(*input_value) == expected_value
