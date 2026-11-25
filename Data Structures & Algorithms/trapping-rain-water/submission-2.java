class Solution {
    public int trap(int[] h) {
        if(h.length==0){
            return 0;
        }
        int l=0;
        int r=h.length-1;

        int leftMax=h[l];
        int rightMax=h[r];

        int ans=0;

        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax=Math.max(leftMax,h[l]);
            ans+=leftMax-h[l];
            }else{
                r--;
                rightMax=Math.max(rightMax,h[r]);
            ans+=rightMax-h[r];
            }
        }
        return ans;
    }
}
