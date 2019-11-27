from typing import Optional


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x: int) -> None:
        self.val = x
        self.left: Optional[TreeNode] = None
        self.right: Optional[TreeNode] = None

    def __repr__(self) -> str:
        return (
            f'{self.__class__.__name__}('
            f'value: {self.val}, '
            f'left({self.val}): {self.left}, '
            f'right({self.val}): {self.right}'
            ')'
        )


def max_depth(root: TreeNode, depth: int = 0) -> int:
    depth += 1
    if not root:
        depth -= 1
        return depth
    right = max_depth(root.right, depth)  # type: ignore
    left = max_depth(root.left, depth)  # type: ignore
    return sorted([right, left])[-1]


class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if not root:
            return 0

        return max_depth(root)
