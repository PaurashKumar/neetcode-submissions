class Solution:
    def maxProfit(self, nums: List[int]) -> int:
        mxprofit=0

        ele=nums[0]

        for i in nums:
            ele=min(ele,i)
            mxprofit=max(mxprofit,i-ele)
        return mxprofit
        