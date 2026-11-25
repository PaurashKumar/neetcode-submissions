class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hm={}
        ans=[]
        for s in strs:
            ss=list(s)
            ss.sort()
            key= str(ss)
            if key not in hm:
                hm[key]=[]
            hm[key].append(s)
        for l in hm.values():
            ans.append(l)
        return ans


        