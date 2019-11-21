# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x: int) -> None:
        self.val = x
        self.left = None
        self.right = None

    def __repr__(self) -> str:
        return (
            f'{self.__class__.__name__}('
            f'value: {self.val}, '
            f'left({self.val}): {self.left}, '
            f'right({self.val}): {self.right}'
            ')'
        )


class Solution:
    def mergeTrees(self, t1: TreeNode, t2: TreeNode) -> TreeNode:
        pass
