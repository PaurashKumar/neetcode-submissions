class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        
        def helper(i,j,m,n):
            if i == m-1 and j==n-1:
                return 1
            if i>= m or j>=n:
                return 0;
            return helper(i+1,j,m,n)+helper(i,j+1,m,n)
        return helper(0,0,m,n)
