from .structures import ListNode

from typing import List

import pytest


class Solution:
    def middleNode(self, head: ListNode) -> ListNode:
        num_elements = 0
        list_node = head
        while True:
            num_elements += 1
            if list_node.next is None:
                break
            list_node = list_node.next

        answer = head
        for _ in range(num_elements // 2):
            answer = answer.next

        return answer


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

        assert list(getattr(solution, method_name)(ListNode.from_list(input_value))) == expected_value
