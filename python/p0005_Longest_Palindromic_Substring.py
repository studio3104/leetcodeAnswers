class Solution:
    def longestPalindrome(self, string: str) -> str:
        if not string:
            return string

        self.len_string = len(string)
        self.string = string
        result = []

        for i in range(self.len_string):
            result.append(self.find_palindromic(i))
            if self.len_string > i + 1 and string[i] == string[i + 1]:
                result.append(self.find_palindromic(i, True))

        return sorted(result, key=len)[-1]

    def find_palindromic(self, index: int, is_even: bool = False) -> str:
        index_b = index + 1 if is_even else index
        width = 1

        while index >= width and self.len_string > index_b + width:
            if self.string[index - width] != self.string[index_b + width]:
                break
            width += 1

        return self.string[(index - width + 1):(index_b + width)]
