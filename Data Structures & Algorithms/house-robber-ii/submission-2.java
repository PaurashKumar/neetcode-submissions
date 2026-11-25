class Solution {
    public int rob(int[] nums) {
        int l=helper(Arrays.copyOfRange(nums,1,nums.length));
        int r=helper(Arrays.copyOfRange(nums,0,nums.length-1));
        return Math.max(nums[0],Math.max(l,r));
    }
    public int helper(int nums[]){
        int r1=0;
        int r2=0;
        for(int n:nums){
            int max=Math.max(n+r1,r2);
            r1=r2;
            r2=max;
        }
        return r2;
    }
}
