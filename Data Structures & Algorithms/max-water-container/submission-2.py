class Solution:
    def maxArea(self, nums: List[int]) -> int:
        ans=0

        l=0
        r=len(nums)-1
        while l < r:
            maxHeight =min(nums[l],nums[r])
            dis=r-l
            ans=max(ans,dis*maxHeight)
            if nums[l] < nums[r]:
                l+=1
            else:
                r-=1
        return ans
        