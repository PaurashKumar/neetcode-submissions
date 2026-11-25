class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans= defaultdict(list)

        for s in strs:
            sorteds= ''.join(sorted(s))
            ans[sorteds].append(s)
        return list(ans.values())
        