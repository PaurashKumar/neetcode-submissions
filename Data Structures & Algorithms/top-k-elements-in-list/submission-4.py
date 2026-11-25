class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        mp={}
        ans=[]
        for i in nums:
            mp[i]=1+mp.get(i,0)
        for key,val in mp.items():
                ans.append([val,key])
        ans.sort()

        result=[]
        while(len(result)<k):
            result.append(ans.pop()[1])
        return result
            
        