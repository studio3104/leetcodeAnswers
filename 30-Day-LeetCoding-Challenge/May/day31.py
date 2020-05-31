from typing import List, Tuple

from collections import deque

import pytest


class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        l1 = len(word1)
        l2 = len(word2)

        if l1 * l2 == 0:
            return l1 + l2

        d: List[List[int]] = [[0] * (l2 + 1) for _ in range(l1 + 1)]

        for i in range(l1 + 1):
            d[i][0] = i
        for i in range(l2 + 1):
            d[0][i] = i

        for n in range(1, l1 + 1):
            for m in range(1, l2 + 1):
                left = d[n - 1][m]
                below = d[n][m - 1]
                left_below = d[n - 1][m - 1]

                if word1[n - 1] == word2[m - 1]:
                    left_below -= 1

                d[n][m] = 1 + min(left, below, left_below)

        return d[l1][l2]


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('minDistance', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (('horse', 'ros'), 3),
        (('intention', 'execution'), 5),
        (('plasma', 'altruism'), 6),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: Tuple[str], expected_value: int) -> None:

        assert getattr(solution, method_name)(*input_value) == expected_value
