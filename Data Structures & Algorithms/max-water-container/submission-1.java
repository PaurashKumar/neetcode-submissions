class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int ans=0;
        while(i<j){
            int h=Math.min(heights[i],heights[j]);

            int dis=j-i;
            
            ans=Math.max(ans,dis*h);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}
