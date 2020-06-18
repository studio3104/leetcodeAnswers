from typing import List

import pytest


class Solution:
    def hIndex(self, citations: List[int]) -> int:
        for i in reversed(range(1, len(citations) + 1)):
            if citations[len(citations) - i] >= i:
                return i

        return 0


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('hIndex', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([0, 1, 3, 5, 6], 3),
        ([0], 0),
        ([], 0),
        ([100], 1),
        ([0, 1], 1),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
