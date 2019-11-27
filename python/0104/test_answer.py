from typing import List, Tuple, Optional

import pytest

from answer import Solution, TreeNode


def create_tree(arr: List[Optional[int]]) -> TreeNode:
    if not arr:
        return None

    nodes = [TreeNode(n) if n else None for n in arr]

    addition = 0
    for i, n in enumerate(arr):
        if n is None:
            addition -= 1
            continue

        index = i + addition
        nodes[i].left = nodes[index + 1] if len(nodes) > index + 1 else None
        nodes[i].right = nodes[index + 2] if len(nodes) > index + 2 else None
        addition += 1

    return nodes[0]


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ([3, 9, 20, None, None, 15, 7], 3),
    ([], 0),
))
def test_max_depth(input_value: List[Optional[int]], expected_result: int, solution: Solution) -> None:
    tree = create_tree(input_value)
    assert solution.maxDepth(tree) == expected_result
