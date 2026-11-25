class Solution {
    public int rob(int[] nums) {
    return Math.max(nums[0],
        Math.max(helper(Arrays.copyOfRange(nums,0,nums.length-1)),
        helper(Arrays.copyOfRange(nums,1,nums.length))));
    }

    int helper(int nums[]){
        int r1=0;
        int r2=0;

        for(int num:nums){
            int tmp=Math.max(r2,r1+num);
            r1=r2;
            r2=tmp;
        }
        return r2;
    }
}
