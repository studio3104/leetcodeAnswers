class Solution:
    def longestPalindrome(self, string: str) -> str:
        self.string = string
        result = []

        for i, s in enumerate(string):
            result.append(self.check_odd(i, 1, s))

        return sorted(result, key=len)[-1]

    def check_odd(self, index: int, width: int, palindromic: str) -> str:
        if index < width or len(self.string) <= index + width:
            return palindromic

        _prev, _next = self.string[index - width], self.string[index + width]

        if _prev == _next:
            palindromic = self.string[(index - width):(index + width + 1)]
            return self.check_odd(index, width + 1, palindromic)

        return palindromic
