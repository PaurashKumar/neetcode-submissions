class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char a[]=s.toCharArray();
            Arrays.sort(a);
            String key=new String(a);
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<String>());
            }
            hm.get(key).add(s);
        }
        for(List<String> ss:hm.values()){
            ans.add(ss);
        }
        return ans;
    }
}
