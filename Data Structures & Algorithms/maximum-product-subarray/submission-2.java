class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            ans=Math.max(ans,curr);
            for(int j=i+1;j<nums.length;j++){
                curr*=nums[j];
                ans=Math.max(curr,ans);
            }
        }
        return ans;
    }
}
