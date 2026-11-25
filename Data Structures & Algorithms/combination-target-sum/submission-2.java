class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ans=new ArrayList<>();
        List<Integer> curr=new ArrayList();
        backtrack(nums,curr,target,0);
        return ans;
    }
    public void backtrack(int[] nums,List<Integer> curr,int target,int i){

        if(target==0){
            ans.add(new ArrayList(curr));
            return;
        }
        if(i >= nums.length || target < 0)
        {
            return ;
        }
        curr.add(nums[i]);
        backtrack(nums,curr,target-nums[i],i);
        curr.remove(curr.size()-1);
        backtrack(nums,curr,target,i+1);
    }
}
