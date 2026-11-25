class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        ans=[]
        def valid(s):
            cc=0
            for c in s:
                if c=='(':
                    cc+=1
                else:
                    cc+=-1
                if cc<0:
                    return False
            return not cc
        def dfs(s):
            if n*2==len(s):
                if(valid(s)):
                    ans.append(s)
                return
            dfs(s+'(')
            dfs(s+')')
        dfs("")
        return ans

        