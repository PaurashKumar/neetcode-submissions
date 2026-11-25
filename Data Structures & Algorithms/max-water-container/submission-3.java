class Solution {
    public int maxArea(int[] nums) {
        int ans=0;

        int l=0;
        int r=nums.length-1;

        while (l <r){
            int h=Math.min(nums[l],nums[r]);
            int d= r-l;
            ans=Math.max(ans,h*d);
            if(nums[l]<nums[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;

        
    }
}
