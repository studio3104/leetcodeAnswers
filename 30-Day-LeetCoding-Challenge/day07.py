from typing import Dict, List

import pytest


class Solution:
    def countElements2(self, arr: List[int]) -> int:
        return len([i for i in range(len(arr)) if arr[i] + 1 in arr])

    def countElements(self, arr: List[int]) -> int:
        counter: Dict[int, int] = {}

        for n in arr:
            if n not in counter:
                counter[n] = 0
            counter[n] += 1

        return len([n for n in arr if n + 1 in counter])


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('countElements', 'countElements2', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([1, 2, 3], 2),
        ([1, 1, 3, 3, 5, 5, 7, 7], 0),
        ([1, 3, 2, 3, 5, 0], 3),
        ([1, 1, 2, 2], 2),
        ([1, 1, 2], 2),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
