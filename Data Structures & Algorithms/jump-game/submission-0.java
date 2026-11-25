class Solution {
    public boolean canJump(int[] nums) {
        int target=nums.length-1;

        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=target){
                target=i;
            }
        }
        return target==0;
    }
}
//[1,2,0,1,0]
//i+nums[i]>=goal
////
////i 3+1. >=4. yes i=3 goal=3
////ii 2+0 >=3 no 
////iii 1 +2 >=3 yes i=1 goal=1
////iv 0+1 >=1  yes i=0 goal=0
//// final goal==i. --> 0==0 return true