class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

        ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<=nums.length-k;i++){
            for(int j=i;j<i+k;j++){
                pq.add(nums[j]);
            }
            al.add(pq.peek());
            pq.clear();
        }

        int n=al.size();
        int ans[]=new int[n];
        int index=0;
        for(int p:al){
            ans[index++]=p;
        }
        return ans;
        
    }
}
