class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm={}
        for i in range(len(nums)):
            diff=target-nums[i]
            if nums[i] in hm:
                ans=[]
               
                ans.append(hm[nums[i]])
                ans.append(i)
                return ans
            hm[diff]=i
        return []
        