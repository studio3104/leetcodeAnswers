from .structures import TreeNode

from typing import List

import pytest


class Solution:
    def diameterOfBinaryTree(self, root: TreeNode) -> int:
        def get_depth(node: TreeNode) -> int:
            if node is None or node.val is None:
                return 0

            return 1 + max(get_depth(node.left), get_depth(node.right))

        def get_diameter(node: TreeNode) -> int:
            if node is None or node.val is None:
                return 0

            diameter = max(get_diameter(node.left), get_diameter(node.right))
            depth = get_depth(node.left) + get_depth(node.right)

            return max(diameter, depth)

        return get_diameter(root)


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('diameterOfBinaryTree', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([1, 2, 3, 4, 5], 3),
        ([], 0),
        (
            [
                4, -7, -3, None, None, -9, -3, 9, -7, -4, None, 6, None, -6, -6, None,
                None, 0, 6, 5, None, 9, None, None, -1, -4, None, None, None, -2,
            ],
            8,
        ),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: int) -> None:

        assert getattr(solution, method_name)(TreeNode.from_list(input_value)) == expected_value
