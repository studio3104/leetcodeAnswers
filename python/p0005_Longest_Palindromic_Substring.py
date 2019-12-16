class Solution:
    def longestPalindrome(self, string: str) -> str:
        if not string:
            return string

        self.len_string = len(string)
        self.string = string
        result = []

        for i in range(self.len_string):
            result.append(self.find_palindromic(i, 1, string[i]))
            if self.len_string > i + 1 and string[i] == string[i + 1]:
                result.append(self.find_palindromic(i, 1, string[i:(i + 2)], True))

        return sorted(result, key=len)[-1]

    def find_palindromic(self, index: int, width: int, palindromic: str, is_even: bool = False) -> str:
        index_b = index + 1 if is_even else index

        if not palindromic or index < width or self.len_string <= index_b + width:
            return palindromic

        if self.string[index - width] == self.string[index_b + width]:
            palindromic = self.string[(index - width):(index_b + width + 1)]
            return self.find_palindromic(index, width + 1, palindromic, is_even)

        return palindromic
