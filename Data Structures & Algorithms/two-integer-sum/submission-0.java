class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(hm.containsKey(diff)){
                return new int[]{hm.get(diff),i};
            }
            hm.put(nums[i],i);
        }

        return new int[]{};
    }
}
// 3-> d=4 ,{{3,0}}
// 4-> d=3 if yes {0,1}
// 5-> d=2 {{3,0},{5,2}}