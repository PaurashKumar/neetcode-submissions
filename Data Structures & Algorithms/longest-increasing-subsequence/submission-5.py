class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        n=len(nums)
        ans=[1]*n

        mx=1
        for i in range(n-1,-1,-1):
            for j in range(i+1,n):
                if nums[i]<nums[j]:
                    ans[i]=max(ans[i],1+ans[j])
                    mx=max(mx,ans[i])
        return mx
        