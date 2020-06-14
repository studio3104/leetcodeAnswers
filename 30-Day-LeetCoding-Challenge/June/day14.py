from typing import List, Tuple

import pytest


class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, K: int) -> int:
        pass


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('findCheapestPrice', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ((3, [[0, 1, 100], [1, 2, 100], [0, 2, 500]], 0, 2, 1), 200),
        ((3, [[0, 1, 100], [1, 2, 100], [0, 2, 500]], 0, 2, 0), 500),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: Tuple[int, List[List[int]], int, int, int], expected_value: int) -> None:

        assert getattr(solution, method_name)(*input_value) == expected_value
