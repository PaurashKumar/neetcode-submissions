class Solution {
    public int maxProduct(int[] nums) {
        int currMax=1;
        int currMin=1;
        int ans=nums[0];


        for(int i:nums){
                int tmp=currMax*i;
                currMax=Math.max(Math.max(i*currMax,i*currMin),i);
                currMin=Math.min(Math.min(tmp,i*currMin),i);
                ans=Math.max(ans,currMax);
        }
        return ans;
    }
}
