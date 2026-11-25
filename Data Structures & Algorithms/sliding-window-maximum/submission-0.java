class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

        for(int i=0;i<=nums.length-k;i++){
            for(int j=i;j<i+k;j++){
                pq.add(nums[j]);
            }
            al.add(pq.peek());
            pq.clear();
        }
        int n=al.size();
        System.out.println(n);
        int p=0;
        int ans[]=new int[n];
        for(int i:al){
            ans[p++]=i;
        }
        return ans;
    }
}
