from typing import List, Optional

import pytest

from April.structures import TreeNode


def invert_tree(t: Optional[TreeNode]) -> Optional[TreeNode]:
    if t is None:
        return t

    t.left, t.right = invert_tree(t.right), invert_tree(t.left)

    return t


class Solution:
    def invertTree(self, root: TreeNode) -> Optional[TreeNode]:
        return invert_tree(root)


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
