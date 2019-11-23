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
    def isSymmetric(self, root: TreeNode) -> bool:
        print(root)
        return True
