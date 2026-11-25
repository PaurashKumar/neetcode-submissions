class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        myHashset=set(nums)
        ans=0
        for n in myHashset:
            if n-1 not in myHashset:
                c=1
                while (c+n in myHashset):
                    c=c+1
                ans=max(ans,c)
        return ans
        