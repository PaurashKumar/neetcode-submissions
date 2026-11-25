class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        left=[0]*n
        right=[0]*n
        l=1
        r=1
        for i in range(0,len(nums)):
            left[i]=l
            l=nums[i]*l
        for i in range(len(nums)-1,-1,-1):
            right[i]=r
            r=nums[i]*r
        for i in range(len(nums)):
            nums[i]=left[i]*right[i]
        return nums
        