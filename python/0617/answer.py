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


class Solution:
    def mergeTrees(self, t1: Optional[TreeNode], t2: Optional[TreeNode]) -> Optional[TreeNode]:
        if not t1:
            return t2
        if not t2:
            return t1
        t1.val += t2.val
        t1.left = self.mergeTrees(t1.left, t2.left)
        t1.right = self.mergeTrees(t1.right, t2.right)
        return t1
