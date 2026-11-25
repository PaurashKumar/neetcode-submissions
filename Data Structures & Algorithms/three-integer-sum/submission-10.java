class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();

        HashSet<List<Integer>> hs=new HashSet<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){

            int j=i+1;
            int k=nums.length-1;

            if(i >0 && nums[i]==nums[i-1]){
                continue;
            }
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];

                if(sum==0){
                    
                    List<Integer> al=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                    if(!hs.contains(al)){
                        hs.add(al);
                        ans.add(al);
                    }
                    j++;
                    k--;
                    if(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }


            }
        }
        return ans;
    }
}
