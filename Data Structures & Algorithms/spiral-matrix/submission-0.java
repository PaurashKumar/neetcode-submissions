class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l=0;
        int r=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;

        List<Integer> al=new ArrayList<>();
        while(l<=r && top<=bottom){
            for(int i=l;i<=r;i++){
                al.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                al.add(matrix[i][r]);
            }
            r--;
            if(!(l<=r && top<=bottom)){
                break;
            }
            for(int i=r;i>=l;i--){
                al.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                al.add(matrix[i][l]);
            }
            l++;
        }
        return al;
    }
}
