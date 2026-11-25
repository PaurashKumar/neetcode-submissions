class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<int[]> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:hm.entrySet()){
            arr.add(new int[]{m.getValue(),m.getKey()});
        }
        arr.sort((a,b)->b[0]-a[0]);
        int ans[]=new int [k];

        for(int i=0;i<k;i++){
            ans[i]=arr.get(i)[1];
        }
        return ans;
    }
}
