class Solution {
    public int[] productExceptSelf(int[] nums) {
       
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int l=1,r=1;
        for(int i=0;i<nums.length;i++){
            left[i]=l;
            l=l*nums[i];
        } // [1,1,2,8]
        for(int i=nums.length-1;i>=0;i--){
            right[i]=r;
            r=r*nums[i];
        } //[48,24,6,1]
        for(int i=0;i<nums.length;i++){
            nums[i]=left[i]*right[i];
        }
        return nums;
    }
}  
