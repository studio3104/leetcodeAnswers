from typing import List

import pytest


class Solution:
    def calculateMinimumHP(self, dungeon: List[List[int]]) -> int:
        pass


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('calculateMinimumHP', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (
            [
                [-2, -3, 3],
                [-5, -10, 1],
                [10, 30, -5],
            ], 7,
        )
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[List[int]], expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
