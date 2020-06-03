from typing import List

import pytest


class Solution:
    def twoCitySchedCost(self, costs: List[List[int]]) -> int:
        pass


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('twoCitySchedCost', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([[10, 20], [30, 200], [400, 50], [30, 20]], 110),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[List[int]], expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
