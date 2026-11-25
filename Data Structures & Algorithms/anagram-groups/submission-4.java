class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        for(String s:strs){
            char str[]=s.toCharArray();
            Arrays.sort(str);
            String key=new String(str);
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());
            }
            hm.get(key).add(s);
        }
        for(Map.Entry<String,ArrayList<String>> h:hm.entrySet()){
            ans.add(h.getValue());
        }
        return ans;
    }
}
