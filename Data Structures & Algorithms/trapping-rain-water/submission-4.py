class Solution:
    def trap(self, nums: List[int]) -> int:
        ans=0
        l=0;
        r=len(nums)-1
        Lmax=nums[l]
        Rmax=nums[r]
        while l<r:
            if Lmax<Rmax:
                l+=1
                Lmax=max(Lmax,nums[l])
                ans+=Lmax-nums[l]
            else:
                r-=1
                Rmax=max(Rmax,nums[r])
                ans+=Rmax-nums[r]
        return ans

        