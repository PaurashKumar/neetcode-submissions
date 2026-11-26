class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l=1
        r=1
        left=[0]*len(nums)
        right=[0]*len(nums)
        for i in range(0,len(nums)):
            left[i]=l
            l=nums[i]*l ## [1,1*1,1*1*2,1*1*2*4]
        for i in range(len(nums)-1,-1,-1):
            right[i]=r
            r=r*nums[i] ##[1*6*4*1,1*6*4,1*6,1]
        for i in range(0,len(nums)):
            nums[i]=left[i]*right[i]
        return nums;

        