class Solution:
    def isPalindrome(self, s: str) -> bool:
        news = ''
        for c in s:
            if c.isalnum():
                news+=c.lower()

        if news[::-1] == news:
            return True
        else:
            return False
        