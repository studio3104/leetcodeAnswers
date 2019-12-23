from typing import Dict


class Solution:
    def __init__(self) -> None:
        self.in_use: Dict[str, None] = {}

    def lengthOfLongestSubstring(self, s: str, start_from: int = 0) -> int:
        longest = 0
        for i in range(start_from, len(s)):
            if s[i] in self.in_use:
                self.in_use.clear()
                return max(longest, self.lengthOfLongestSubstring(s, start_from + 1))
            self.in_use[s[i]] = None
            longest += 1
        return longest
