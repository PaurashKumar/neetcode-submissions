class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         
        int l1=nums1.length;
        int l2=nums2.length;
        int merged[]=new int[l1+l2];

        System.arraycopy(nums1,0,merged,0,l1);
        System.arraycopy(nums2,0,merged,l1,l2);
        Arrays.sort(merged);

        int totalL=merged.length;
        if(totalL%2==1){
            return merged[totalL/2];
        }else{
            return (merged[totalL/2 -1] + merged[totalL/2]) /2.0;
        }
         
    }
}
