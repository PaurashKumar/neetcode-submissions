class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        a1=list(s)
        b1=list(t)

        a1.sort()
        b1.sort()

        if a1==b1:
            return True
        else:
            return False
        