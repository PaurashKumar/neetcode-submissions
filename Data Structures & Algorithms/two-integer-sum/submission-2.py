class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm={}
        for i,n in enumerate(nums):
            diff=target-n
            if n in hm:
                return [hm[n],i]
            hm[diff]=i
        return []
        