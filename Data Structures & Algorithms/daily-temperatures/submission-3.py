class Solution:
    def dailyTemperatures(self, t: List[int]) -> List[int]:
        n=len(t)

        ans=[0]*n

        for i in range(n-2,-1,-1):
            j=i+1
            while j<n and t[j]<=t[i]:
                if ans[j]==0:
                    j=n
                    break
                j+=ans[j]
            if j<n:
                ans[i]=j-i
        return ans

