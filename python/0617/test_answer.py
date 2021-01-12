from typing import List, Tuple, Optional

import pytest

from answer import Solution, TreeNode


def create_tree(arr: List[Optional[int]]) -> TreeNode:
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
    (([1, 3, 2, 5], [2, 1, 3, None, 4, None, 7]), [3, 4, 5, 5, 4, None, 7]),
))
def test_merge_trees(
        input_value: Tuple[List[Optional[int]]],
        expected_result: List[Optional[int]],
        solution: Solution) -> None:
    t1, t2 = (create_tree(val) for val in input_value)
    assert repr(solution.mergeTrees(t1, t2)) == repr(create_tree(expected_result))
