class Solution {
    public int rob(int[] nums) {
        //return recc(nums,0);
        int a=0;
        int b=0;

        for(int i:nums){
            int tmp=Math.max(i+a,b);
            a=b;
            b=tmp;
        }
        return b;
    }
    public int recc(int nums[],int i){
        if(i>=nums.length){
            return 0;
        }
        return Math.max(recc(nums,i+1),nums[i]+recc(nums,i+2));
    }
}
