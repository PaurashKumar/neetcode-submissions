class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0;
        int r=m-1;
        while(l<n && r>=0){
            if(matrix[l][r]==target){
                return true;
            }else if(matrix[l][r]<target){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }
}
