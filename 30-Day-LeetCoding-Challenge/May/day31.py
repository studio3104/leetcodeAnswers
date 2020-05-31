from typing import List, Tuple

from collections import deque

import pytest


class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        w1 = []
        w2 = []

        for i in range(max(len(word1), len(word2))):
            if len(word1) > i:
                w1.append(word1[i])
            else:
                w1.append('x')

            if len(word2) > i:
                w2.append(word2[i])
            else:
                w2.append('x')

        count = 0
        for i in range(len(w1)):
            if w1[i] == w2[i]:
                continue

            if len(w1) > i + 1 and w1[i+1] == w2[i]:
                del(w1[i+1])
                w1.append('x')

            if len(w2) > i + 1 and w2[i+1] == w1[i]:
                del(w2[i+1])
                w2.append('x')

            count += 1

        return count


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
