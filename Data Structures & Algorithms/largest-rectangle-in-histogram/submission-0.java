class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxarea=0;

        for(int i=0;i<n;i++){
            int height=heights[i];
            
            int rightMost=i+1;
            while(rightMost < n && heights[rightMost] >=height){
                rightMost++;
            }

            int leftMost=i;
            while(leftMost >=0 && heights[leftMost] >= height){
                leftMost--;
            }

            leftMost++;
            rightMost--;
            maxarea=Math.max(maxarea,height*(rightMost-leftMost+1));

        }
        return maxarea;
    }
}
