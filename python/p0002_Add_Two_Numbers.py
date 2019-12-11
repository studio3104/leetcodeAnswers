from utils import ListNode

from typing import Tuple


def determine_nums(sum_val: int) -> Tuple[int, int]:
    move_up = 0

    if sum_val > 9:
        sum_val = int(str(sum_val)[-1])
        move_up = 1

    return sum_val, move_up


class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        first, move_up = determine_nums(l1.val + l2.val)
        answer = ListNode(first)
        self.add_two_numbers(l1.next, l2.next, answer, move_up)
        return answer

    def add_two_numbers(self, l1: ListNode, l2: ListNode, answer: ListNode, move_up: int) -> ListNode:
        if not l1 and not l2:
            if move_up:
                answer.next = ListNode(move_up)
                return answer.next
            else:
                return answer

        num = move_up
        l1_next, l2_next = None, None

        if l1:
            num += l1.val
            l1_next = l1.next

        if l2:
            num += l2.val
            l2_next = l2.next

        val, move_up = determine_nums(num)
        answer.next = ListNode(val)

        return self.add_two_numbers(l1_next, l2_next, answer.next, move_up)
