class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hs=set(nums)
        ans=0
        for i in hs:
            if i-1 not in hs:
                c=1;
                while(c+i in hs):
                    c=c+1
                ans=max(c,ans)
        return ans   
        