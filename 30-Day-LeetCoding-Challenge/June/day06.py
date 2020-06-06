from typing import List

import pytest


class Solution:
    def reconstructQueue(self, people: List[List[int]]) -> List[List[int]]:
        pass


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('reconstructQueue', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([[7, 0], [4, 4], [7, 1], [5, 0], [6, 1], [5, 2]], [[5, 0], [7, 0], [5, 2], [6, 1], [4, 4], [7, 1]]),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[List[int]], expected_value: List[List[int]]) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
