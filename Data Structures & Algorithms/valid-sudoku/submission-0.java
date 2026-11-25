class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs=new HashSet<>();
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]!='.')
                {
                    String ele="("+board[r][c]+")";

                    if(!hs.add(ele+r) ||!hs.add(c+ele) ||!hs.add(r/3+ele+c/3)){
                        return false;
                    }


                }

            }
        }
        return true;
    }
}
