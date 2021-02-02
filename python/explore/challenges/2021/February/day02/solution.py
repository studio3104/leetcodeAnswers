from typing import Optional

from utils.treenode import TreeNode


class Solution:
    def trimBST(self, root: Optional[TreeNode], low: int, high: int) -> Optional[TreeNode]:
        if root is None:
            return root

        left = self.trimBST(root.left, low, high)
        right = self.trimBST(root.right, low, high)

        if root.val < low:
            return right
        if root.val > high:
            return left

        root.left = left
        root.right = right

        return root
