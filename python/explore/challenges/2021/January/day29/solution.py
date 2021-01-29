from dataclasses import dataclass
from typing import List, Optional

from utils.treenode import TreeNode


@dataclass
class NodeProp:
    col: int
    row: int
    val: int


class Solution:
    def traverse(self, node: Optional[TreeNode], row: int, col: int, node_props: List[NodeProp]) -> None:
        if node is None:
            return

        node_props.append(NodeProp(col, row, node.val))
        self.traverse(node.left, row + 1, col - 1, node_props)
        self.traverse(node.right, row + 1, col + 1, node_props)

    def verticalTraversal(self, root: TreeNode) -> List[List[int]]:
        node_props: List[NodeProp] = []
        self.traverse(root, 0, 0, node_props)
        node_props.sort(key=lambda prop: (prop.col, prop.row, prop.val))

        result = []
        index = node_props[0].col
        current = []

        for p in node_props:
            if p.col == index:
                current.append(p.val)
                continue

            result.append(current)
            index = p.col
            current = [p.val]

        result.append(current)

        return result
