class Solution:
    def dailyTemperatures(self, t: List[int]) -> List[int]:

        n=len(t)
        ans=[]

        for i in range(n):
            c=1
            j=i+1
            while j<n:
                if t[i]<t[j]:
                    break
                j+=1
                c+=1
            c=0 if j==n else c
            ans.append(c)
        return ans
        