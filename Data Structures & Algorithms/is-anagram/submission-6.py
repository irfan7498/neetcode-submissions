class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!= len(t):
            return False
        count = {}
        count_t = {}
        for letter in s:
            count[letter] = count.get(letter, 0) + 1
        for letter in t:
            count_t[letter] = count_t.get(letter, 0) + 1
        for letter in s:
            if letter not  in count_t:
                return False
            if count[letter] != count_t[letter]:
                return False
        return True
        # let just use set of s and t and compare that
        