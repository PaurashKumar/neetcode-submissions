class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans={}
        for i in range(len(nums)):
            diff=target-nums[i];
            if(nums[i] in ans):
                return [ans[nums[i]],i]
            ans[diff]=i
        return [];
        