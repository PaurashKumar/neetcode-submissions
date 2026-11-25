class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> al=new ArrayList<>();
        HashSet<List<Integer>> hs=new HashSet<>();

        for(int i=0;i<nums.length-1;i++){

            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> subal=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                   
                    if(!hs.contains(subal)){
                        hs.add(subal);
                        al.add(subal);
                    }
                    j++;
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
    return al;
    }
}
