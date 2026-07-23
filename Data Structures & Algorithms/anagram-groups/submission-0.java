class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();

        for(String s:strs){
            char[] new_s=s.toCharArray();
            Arrays.sort(new_s);
            String key_s=new String(new_s);
            if(!hm.containsKey(key_s)){
                ArrayList<String> sublist=new ArrayList();
                //sublist.add(s);
                hm.put(key_s,sublist);
            }
            hm.get(key_s).add(s);
        }
        
        return new ArrayList<>(hm.values());
    }
}
