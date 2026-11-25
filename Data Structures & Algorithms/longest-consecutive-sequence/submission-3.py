class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        hs=set(nums)
        ans=0

        for n in hs:
            if n-1 not in hs:
                c=1
                while (n+c in hs):
                    c=c+1
                ans=max(ans,c)
        return ans