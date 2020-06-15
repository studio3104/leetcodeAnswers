from typing import List, Tuple

from April.structures import TreeNode  # noqa

import pytest


class Solution:
    def searchBST(self, root: TreeNode, val: int) -> TreeNode:
        return TreeNode.from_list([])


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('searchBST', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (([4, 2, 7, 1, 3], 2), [2, 1, 3]),
        (([4, 2, 7, 1, 3], 5), [None]),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: Tuple[List[int], int], expected_value: List[int]) -> None:

        _root, val = input_value
        root = TreeNode.from_list(_root)
        answer: TreeNode = getattr(solution, method_name)(root, val)
        assert list(answer) == expected_value
