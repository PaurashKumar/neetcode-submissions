class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
             int j=i+1;
             int k=nums.length-1;
             while(j<k){
                 
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> al=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                        if(!hs.contains(al)){
                            hs.add(al);
                            ans.add(al);
                        
                        }  
                        j++;
                        k--; 
                        while(j<k && nums[j]==nums[j-1]){
                            j++;
                        }         
                    }else if (nums[i]+nums[j]+nums[k]<0){
                        j++;
                    }else{
                        k--;
                    }
                }
        }  
        return ans;
    }
}
