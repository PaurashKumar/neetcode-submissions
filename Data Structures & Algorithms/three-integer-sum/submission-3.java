class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length;j++){
                for (int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> al=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                        if(!hs.contains(al)){
                            hs.add(al);
                            ans.add(al);
                        }                   
                    }
                }
            }
        }
        return ans;
    }
}
