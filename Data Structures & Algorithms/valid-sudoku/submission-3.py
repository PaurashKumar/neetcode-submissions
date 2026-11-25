class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        hs = set()
        for r in range(9):
            for c in range(9):
                if board[r][c] != '.':
                    s = "(" + board[r][c] + ")"
                    if (r, s) in hs or (s, c) in hs or (r // 3, c // 3, board[r][c]) in hs:
                        return False
                    hs.add((r, s))
                    hs.add((s, c))
                    hs.add((r // 3, c // 3, board[r][c]))
        return True