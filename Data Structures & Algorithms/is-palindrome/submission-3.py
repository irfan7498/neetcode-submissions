class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.replace(" ", "").lower()
        end = len(s)
        start = 0 
        while(start < end):
            while (start < end and not s[start].isalnum()):
                start += 1
            while (start < end and not s[end-1].isalnum()):
                end -= 1
            if ( start >= end ):
                break
            if (s[start] == s[end -1]):
                start += 1
                end -= 1
            else:
                return False
        return True