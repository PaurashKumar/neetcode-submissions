class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
         HashSet<Character> avl=new HashSet<>();
         for(int j=0;j<9;j++){
            char ch=board[i][j];
               if(board[i][j]=='.'){
                  continue;
               }
               if(avl.contains(ch)){
                  return false;
               }
               avl.add(ch);
         }
        }

        for(int i=0;i<9;i++){
         HashSet<Character> avl=new HashSet<>();
         for(int j=0;j<9;j++){
            char ch=board[j][i];
            if(ch=='.'){
               continue;
            }
            if(avl.contains(ch)){
               return false;
            }
            avl.add(ch);
         }
        }
        for(int sqr=0;sqr<9;sqr++){
         HashSet<Character> hs=new HashSet<>();
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               int row=(sqr/3)*3 +i; // 0/3 *3 +0 =0
               int col=(sqr%3)*3 +j; // 0%3 *3 +0 =
            
            char  ch=board[row][col];
            if(ch=='.'){
               continue;
            }
            if(hs.contains(ch)){
               return false;
            }
            hs.add(ch);
         }

         }

        }
        return true;
    }
}
