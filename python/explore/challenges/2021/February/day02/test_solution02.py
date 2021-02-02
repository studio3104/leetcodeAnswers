import pytest

from utils.treenode import stringToTreeNode, TreeNode, treeNodeToString
from .solution import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('root_str', 'low', 'high', 'expected_str'), (
        ('[1,0,2]', 1, 2, '[1,null,2,null,null]'),
        ('[3,0,4,null,2,null,null,1]', 1, 3, '[3,2,null,1,null,null,null]'),
        ('[1]', 1, 2, '[1,null,null]'),
        ('[1,null,2]', 1, 3, '[1,null,2,null,null]'),
        ('[1,null,2]', 2, 4, '[2,null,null]'),
))
def test_solution(root_str: str, low: int, high: int, expected_str: str, solution: Solution) -> None:
    root: TreeNode = stringToTreeNode(root_str)  # noqa
    assert treeNodeToString(solution.trimBST(root, low, high)) == expected_str
