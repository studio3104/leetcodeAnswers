from .structures import TreeNode

from typing import List

import pytest


class Solution:
    def diameterOfBinaryTree(self, root: TreeNode) -> int:
        pass


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('middleNode', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([1, 2, 3, 4, 5], 3),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: int) -> None:

        assert getattr(solution, method_name)(TreeNode.from_list(input_value)) == expected_value
