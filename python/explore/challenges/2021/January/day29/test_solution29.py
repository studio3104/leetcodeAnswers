from typing import List

import pytest

from utils.treenode import TreeNode, stringToTreeNode, prettyPrintTree
from .solution import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('root', 'expected'), (
        (stringToTreeNode('[3,9,20,null,null,15,7]'), [[9], [3, 15], [20], [7]]),
        (stringToTreeNode('[1,2,3,4,5,6,7]'), [[4], [2], [1, 5, 6], [3], [7]]),
))
def test_solution(root: TreeNode, expected: List[List[int]], solution: Solution) -> None:
    try:
        assert solution.verticalTraversal(root) == expected
    except AssertionError:
        print()
        prettyPrintTree(root)
        raise
