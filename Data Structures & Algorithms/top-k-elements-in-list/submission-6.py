class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        mp={}
        ans=[]
        for i in nums:
            mp[i]=mp.get(i,0)+1
        for key,v in mp.items():
            ans.append([v,key])
        ans.sort()

        result=[]

        while (len(result)<k):
            result.append(ans.pop()[1])
        return result
        