class Solution {
    public int[] productExceptSelf(int[] nums) {
     int k=1;
     int n=nums.length-1;
     int[] prefix=new int[nums.length];
     int[] suffix=new int[nums.length];
     int[] ans=new int[nums.length];
     for(int i=0;i<=n;i++){
        prefix[i]=k; // [1,1,2,8]  1,k=1*1=1  || 1 k=1*2 || 2 k=2*4  || 8 k=8*6
        k=k*nums[i];
     }   
     k=1;
     for(int i=n;i>=0;i--){
        suffix[i]=k;   //[48,24,6,1] 1 k=1*6 || 6 k=6*4 || 24 k=24 * 2 || 48 k=48*1
        k=k*nums[i];
     }

     for (int i=0;i<=n;i++){
        ans[i]=prefix[i]*suffix[i];
     }
    return ans;
    }
}  
