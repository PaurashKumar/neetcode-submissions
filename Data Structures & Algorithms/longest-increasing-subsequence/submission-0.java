class Solution {
    public int lengthOfLIS(int[] nums) {
        int dm[]=new int[nums.length];
        Arrays.fill(dm,1);

        for(int i=nums.length-1;i>=0;i--){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    dm[i]=Math.max(dm[i],1+dm[j]);
                }
            }
        }
        int max=dm[0];
        for(int i:dm){
            max=Math.max(i,max);
        }
        return max;
    }
}
