class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            if(!hm.containsKey(i)){
                hm.put(i,1);
            }else{
                hm.put(i,hm.get(i)+1);
            }
        }
        List<Map.Entry<Integer,Integer>> list=new 
        ArrayList<Map.Entry<Integer,Integer>>(hm.entrySet());
        Collections.sort(list,(l1,l2)->l1.getValue().compareTo(l2.getValue()));
        Collections.reverse(list);
        int ans[]=new int[k];
        int i=0;
        for (Map.Entry<Integer, Integer> entry : list) {
            if(k>0){
                ans[i++]=entry.getKey();
            }
            k--;
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //Collections.reverse(list);

         
        
          
        return ans;
         
    }
}
