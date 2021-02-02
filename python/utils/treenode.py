from typing import Optional, List


class TreeNode:
    def __init__(self, x: int) -> None:
        self.val = x
        self.left: Optional[TreeNode] = None
        self.right: Optional[TreeNode] = None


def treeNodeToString(root: Optional[TreeNode]) -> str:
    if not root:
        return "[]"

    output = ""
    queue: List[Optional[TreeNode]] = [root]
    current = 0

    while current != len(queue):
        node = queue[current]
        current += 1

        if not node:
            output = f"{output}null,"
            continue

        output = f"{output}{str(node.val)},"
        queue.append(node.left)
        queue.append(node.right)

    return f"[{output[:-1]}]"


def stringToTreeNode(string: str) -> Optional[TreeNode]:
    string = string.strip()
    string = string[1:-1]
    if not string:
        return None

    input_values = [s.strip() for s in string.split(',')]
    root = TreeNode(int(input_values[0]))
    node_queue: List[TreeNode] = [root]
    front = 0
    index = 1

    while index < len(input_values):
        node = node_queue[front]
        front += 1

        item = input_values[index]
        index += 1
        if item != "null":
            left_number = int(item)
            node.left = TreeNode(left_number)
            node_queue.append(node.left)

        if index >= len(input_values):
            break

        item = input_values[index]
        index += 1
        if item != "null":
            right_number = int(item)
            node.right = TreeNode(right_number)
            node_queue.append(node.right)

    return root


def prettyPrintTree(node: Optional[TreeNode], prefix: str = "", is_left: bool = True) -> None:
    if not node:
        print("Empty Tree")
        return

    if node.right:
        prettyPrintTree(node.right, f"{prefix}{'│   ' if is_left else '    '}", False)

    print(f"{prefix}{'└── ' if is_left else '┌── '}{str(node.val)}")

    if node.left:
        prettyPrintTree(node.left, f"{prefix}{'    ' if is_left else '│   '}", True)
