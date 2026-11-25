class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        hs=set()
        ans=0
        j=0

        for i in range(len(s)):

            while(s[i] in hs):
                hs.remove(s[j])
                j+=1
            hs.add(s[i])
            ans=max(ans,i-j+1)
        return ans
        