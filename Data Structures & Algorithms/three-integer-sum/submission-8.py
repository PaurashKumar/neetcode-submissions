class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        nums.sort()
        for i in range(len(nums)-1):
            if nums[i] >0:
                break
            if nums[i] == nums[i-1] and i >0:
                continue
            l=i+1
            r=len(nums)-1
            while l<r:
                sum=nums[i]+nums[l]+nums[r]
                if sum < 0:
                    l+=1
                elif sum >0:
                    r-=1
                else:
                     
                    
                    ans.append([nums[i],nums[l],nums[r]])
                    l+=1
                    r-=1
                    while l<r and nums[l] ==nums[l-1]:
                        l+=1
        return ans