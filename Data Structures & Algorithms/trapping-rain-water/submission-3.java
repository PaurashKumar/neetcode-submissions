class Solution {
    public int trap(int[] nums) {

        int l=0;
        int r=nums.length-1;

        int leftMax=nums[l];
        int rightMax=nums[r];

        int ans=0;

        while(l<r){

            if(leftMax<rightMax){
                   l++;
                   leftMax=Math.max(leftMax,nums[l]);
                   ans+=leftMax-nums[l]; 
            }else{
                   r--;
                   rightMax=Math.max(rightMax,nums[r]);
                   ans+=rightMax-nums[r];
            }

         
        }
        return ans;
    }
}
