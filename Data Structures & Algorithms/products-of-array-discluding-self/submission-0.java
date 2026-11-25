class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=1,r=1;
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            left[i]=l;
            l=l*nums[i];
        }// [1,1,2,8]
        for(int j=nums.length-1;j>=0;j--){
            right[j]=r;
            r=r*nums[j];
        }//[48,24,6,1]

        for(int i=0;i<nums.length;i++){
            nums[i]=left[i]*right[i];
        }
        return nums;
    }
}  
