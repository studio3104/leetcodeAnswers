from typing import List


class Solution:
    def reverseString(self, s: List[str]) -> None:
        s.reverse()

    def reverseString2(self, s: List[str]) -> None:
        begin, end = 0, len(s) - 1
        while begin < end:
            s[begin], s[end] = s[end], s[begin]
            begin += 1
            end -= 1
