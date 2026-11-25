class Solution {
    public int trap(int[] h) {
        
        if(h==null || h.length==0){
            return 0;
        }
        int ans=0;
        int l=0;
        int r=h.length-1;

        int leftmax=h[l];
        int rightmax=h[r];

        while(l<r){
            if(leftmax<rightmax){
                l++;
                leftmax=Math.max(leftmax,h[l]);
                ans+=leftmax-h[l];
            }else{
                r--;
                rightmax=Math.max(rightmax,h[r]);
                ans+=rightmax-h[r];
            }

        }
        return ans;
    }
}
