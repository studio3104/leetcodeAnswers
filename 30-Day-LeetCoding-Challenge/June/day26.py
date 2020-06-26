from typing import List

from April.structures import TreeNode

import pytest


class Solution:
    def sumNumbers(self, root: TreeNode) -> int:
        def DFS(tree: TreeNode, num_str: str = '') -> int:
            num_str = f'{num_str}{tree.val}'

            if not tree.left and not tree.right:
                return int(num_str)

            answer = 0
            if tree.left:
                answer += DFS(tree.left, num_str)
            if tree.right:
                answer += DFS(tree.right, num_str)

            return answer

        return DFS(root) if root and root.val is not None else 0


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('sumNumbers', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([1, 2, 3], 25),
        ([4, 9, 0, 5, 1], 1026),
        ([0], 0),
        ([0, 1], 1),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: int) -> None:

        root = TreeNode.from_list(input_value)
        assert getattr(solution, method_name)(root) == expected_value
