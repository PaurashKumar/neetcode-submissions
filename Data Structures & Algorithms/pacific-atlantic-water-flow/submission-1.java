class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows=heights.length;
        int cols=heights[0].length;

        Set<Integer> pac=new HashSet<>();
        Set<Integer> atl=new HashSet<>();

        for(int i=0;i<rows;i++){
            dfs(i,0,pac,heights[i][0],rows,cols,heights);
            dfs(i,cols-1,atl,heights[i][cols-1],rows,cols,heights);
        }
        for(int i=0;i<cols;i++){
            dfs(0,i,pac,heights[0][i],rows,cols,heights);
            dfs(rows-1,i,atl,heights[rows-1][i],rows,cols,heights);
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int coord=i*cols +j;
                if(pac.contains(coord) && atl.contains(coord)){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;
    }
    public void dfs(int r,int c,Set<Integer> visit,int preheight,int rows,int cols,int [][] heights){
       int coord=r*cols+c;
       if(r<0 || c<0 || r==rows || c== cols || heights[r][c]<preheight || visit.contains(coord)){
        return ;
       } 
       visit.add(coord);
       dfs(r+1,c,visit,heights[r][c],rows,cols,heights);
       dfs(r-1,c,visit,heights[r][c],rows,cols,heights);
       dfs(r,c+1,visit,heights[r][c],rows,cols,heights);
       dfs(r,c-1,visit,heights[r][c],rows,cols,heights);
    }
}
