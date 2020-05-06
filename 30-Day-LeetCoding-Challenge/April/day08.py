from .structures import ListNode

from typing import List

import pytest


class Solution:
    def middleNode(self, head: ListNode) -> ListNode:
        pass


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('middleNode', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([1, 2, 3, 4, 5], [3, 4, 5]),
        ([1, 2, 3, 4, 5, 6], [4, 5, 6]),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: List[int]) -> None:

        assert getattr(solution, method_name)(input_value) == ListNode.from_list(expected_value)
