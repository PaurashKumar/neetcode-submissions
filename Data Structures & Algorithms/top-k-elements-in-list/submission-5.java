class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        ArrayList<Integer> al=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:list){
            if(k>0){
                al.add(m.getKey());
                k--;
            }
        }
        int ans[]=al.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}