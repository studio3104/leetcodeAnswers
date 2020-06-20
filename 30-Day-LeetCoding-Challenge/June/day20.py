from typing import Tuple

import pytest

from itertools import permutations


cache = {}


class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        if n not in cache:
            cache[n] = list(permutations(range(1, n + 1)))
        return ''.join(map(str, cache[n][k - 1]))


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('getPermutation', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ((3, 1), '123'),
        ((3, 3), '213'),
        ((4, 9), '2314'),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: Tuple[int, int], expected_value: str) -> None:

        assert getattr(solution, method_name)(*input_value) == expected_value
