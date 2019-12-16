class Solution:
    def longestPalindrome(self, string: str) -> str:
        if not string:
            return string

        self.len_string = len(string)
        self.string = string
        result = []

        for i in range(self.len_string):
            result.append(self.check_odd(i, 1, string[i]))
            if self.len_string > i + 1 and string[i] == string[i + 1]:
                result.append(self.check_even(i, i + 1, 1, string[i:(i + 2)]))

        return sorted(result, key=len)[-1]

    def check_odd(self, index: int, width: int, palindromic: str) -> str:
        if index < width or self.len_string <= index + width:
            return palindromic

        _prev, _next = self.string[index - width], self.string[index + width]

        if _prev == _next:
            palindromic = self.string[(index - width):(index + width + 1)]
            return self.check_odd(index, width + 1, palindromic)

        return palindromic

    def check_even(self, index_a: int, index_b: int, width: int, palindromic: str) -> str:
        if not palindromic or index_a < width or self.len_string <= index_b + width:
            return palindromic

        _prev, _next = self.string[index_a - width], self.string[index_b + width]

        if _prev == _next:
            palindromic = self.string[(index_a - width):(index_b + width + 1)]
            return self.check_even(index_a, index_b, width + 1, palindromic)

        return palindromic
