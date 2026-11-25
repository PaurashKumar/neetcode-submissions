class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            if(!hm.containsKey(i)){
                hm.put(i,1);
            }else{
                hm.put(i,hm.getOrDefault(i,0)+1);
            }
        }
        List<Map.Entry<Integer,Integer>> al=new ArrayList<>(hm.entrySet());

        Collections.sort(al,(l1,l2)->l2.getValue().compareTo(l1.getValue()));

        int i=0;
        int ans[]=new int[k];

        for(Map.Entry<Integer,Integer> m:al){
            if(k>i){
                ans[i]=m.getKey();
                i++;
            }
        }
        return ans;
    }
}
