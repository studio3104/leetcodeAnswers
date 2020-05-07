from typing import List

import heapq

import pytest


class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones = [s * -1 for s in stones]
        heapq.heapify(stones)

        while len(stones) > 1:
            a = heapq.heappop(stones)
            b = heapq.heappop(stones)

            if a != b:
                heapq.heappush(stones, a - b)

        return stones[0] * -1 if stones else 0


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('lastStoneWeight', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([2, 7, 4, 1, 8, 1], 1),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
