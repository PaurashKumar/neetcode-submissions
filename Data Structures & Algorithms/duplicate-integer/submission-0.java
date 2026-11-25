class Solution {
    public boolean hasDuplicate(int[] nums) {
         Set<Integer> hs=new HashSet<>();
         for(int i:nums){
            hs.add(i);
         }
        if(nums.length!=hs.size()){
            return true;
        }else{
            return false;
        }
    }
}
