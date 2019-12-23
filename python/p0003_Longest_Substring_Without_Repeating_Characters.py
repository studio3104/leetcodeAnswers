from typing import Dict


class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        in_use: Dict[str, int] = {}
        longest = 0
        index_last_appeared = 0

        for i in range(len(s)):
            if s[i] in in_use:
                index_last_appeared = max(in_use[s[i]], index_last_appeared)
            longest = max(longest, i - index_last_appeared + 1)
            in_use[s[i]] = i + 1

        return longest
