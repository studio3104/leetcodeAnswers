from typing import List
from April.structures import TreeNode
import pytest


class Solution:
    def countNodes(self, root: TreeNode, count: int = 0) -> int:
        if not root or root.val is None:
            return count

        if root.right is None and root.left is None:
            return count + 1
        
        return 1 + self.countNodes(root.right) + self.countNodes(root.left)


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('countNodes', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([1, 2, 3, 4, 5, 6], 6),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: int) -> None:

        tree = TreeNode.from_list(input_value)
        assert getattr(solution, method_name)(tree) == expected_value
