class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> al=new ArrayList<Integer>();
     
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)->b-a);

        for(int i=0;i<=nums.length-k;i++){
            for(int j=i;j<i+k;j++){
                pq.add(nums[j]);
            }
            System.out.println(pq.peek());
            al.add(pq.peek());
            pq.clear();
        }
        int ind=0;
        int arr[]=new int[al.size()];
        for(int i:al){
            arr[ind++]=i;
        }
        return arr;
    }
}
