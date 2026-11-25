class Solution:
    def topKFrequent(self, nums: List[int], kk: int) -> List[int]:
        mp={}
        for n in nums:
            mp[n] =1 + mp.get(n,0)
        arr=[]

        for k,v in mp.items():
            arr.append([v,k])
        arr.sort()


        res=[]
        while len(res)<kk:
            res.append(arr.pop()[1])
        return res