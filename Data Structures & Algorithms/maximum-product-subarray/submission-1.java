class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int currmin=1;
        int currmax=1;
        for (int n:nums){
            int tmp=currmax*n;
            currmax=Math.max(Math.max(n*currmax,n*currmin),n);
            currmin=Math.min(Math.min(tmp,n*currmin),n);
            ans=Math.max(ans,currmax);
        }
        return ans;
    }
}
