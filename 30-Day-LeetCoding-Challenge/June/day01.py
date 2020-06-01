from typing import List, Optional

import pytest

from April.structures import TreeNode


class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root is not None:
            root.left, root.right = self.invertTree(root.right), self.invertTree(root.left)
        return root


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('invertTree', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([4, 2, 7, 1, 3, 6, 9], [4, 7, 2, 9, 6, 3, 1]),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: List[int]) -> None:

        assert list(getattr(solution, method_name)(TreeNode.from_list(input_value))) == expected_value
