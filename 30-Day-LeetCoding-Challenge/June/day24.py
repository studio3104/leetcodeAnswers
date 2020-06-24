from typing import Dict

import pytest

memo: Dict[int, int] = {0: 1, 1: 1, 2: 2}


def memo_num_trees(n: int) -> None:
    if n in memo:
        return None

    memo[n] = 0
    for i in range(1, n + 1):
        memo[n] += memo[len(range(1, i))] * memo[len(range(i, n))]


class Solution:
    def numTrees(self, n: int) -> int:
        if n not in memo:
            for i in range(1, n + 1):
                memo_num_trees(i)
        return memo[n]


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('numTrees', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (1, 1),
        (2, 2),
        (3, 5),
        (4, 14),
        (5, 42),
        (6, 132),
        (7, 429),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: int, expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
