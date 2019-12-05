from typing import Optional


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x: int) -> None:
        self.val = x
        self.left: Optional['TreeNode'] = None
        self.right: Optional['TreeNode'] = None


def invert_tree(node: TreeNode) -> TreeNode:
    if not node:
        return node

    node.right, node.left = invert_tree(node.left), invert_tree(node.right)  # type: ignore

    return node


class Solution:
    def invertTree(self, root: TreeNode) -> Optional[TreeNode]:
        return invert_tree(root) if root else None
