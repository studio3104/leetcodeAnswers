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


def compare(t1: TreeNode, t2: TreeNode) -> bool:
    if not t1 and not t2:
        return True
    if not t1 or not t2:
        return False
    return t1.val == t2.val and compare(t1.left, t2.right) and compare(t1.right, t2.left)


class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        return compare(root, root)
