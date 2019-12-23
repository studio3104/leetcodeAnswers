from typing import Dict


class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        in_use: Dict[str, int] = {}
        longest = 0
        ii = 0

        for i in range(len(s)):
            if s[i] in in_use:
                ii = max(in_use[s[i]], ii)
            longest = max(longest, i - ii + 1)
            in_use[s[i]] = i + 1

        return longest
