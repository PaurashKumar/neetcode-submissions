class Solution {
    //O(2exp t)
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans =new ArrayList<List<Integer>>();
        List<Integer> curr=new ArrayList<>();
        backtrack(nums,ans,curr,target,0);
        return ans;
    }
    public void backtrack(int nums[],List<List<Integer>> ans,List<Integer> curr,int target,int index){
        if(target==0){
            ans.add(new ArrayList(curr));
        }else if(target<0 || index>=nums.length){
            return ;
        }else{
            curr.add(nums[index]);
            backtrack(nums,ans,curr,target-nums[index],index);
            curr.remove(curr.get(curr.size()-1));
            backtrack(nums,ans,curr,target,index+1);
        }
    }
}
