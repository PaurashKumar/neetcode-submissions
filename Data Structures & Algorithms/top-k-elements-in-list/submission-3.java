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
        List<Map.Entry<Integer,Integer>> ls=new
        ArrayList<Map.Entry<Integer,Integer>>(hm.entrySet());

        Collections.sort(ls,(l1,l2)->l2.getValue().compareTo(l1.getValue()));
        int i=0;
        int arr[]=new int[k];
        for(Map.Entry<Integer,Integer> e:ls){
            if(k>i){
                arr[i++]=e.getKey();
            }
            System.out.println(e.getValue());
        }
        return arr;
    }
}
