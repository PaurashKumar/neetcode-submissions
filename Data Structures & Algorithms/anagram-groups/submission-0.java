class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char[] ary=s.toCharArray();
            Arrays.sort(ary);
            String key=Arrays.toString(ary);
            if(!hm.containsKey(key)){
               hm.put(key,new ArrayList<>());
            }
            hm.get(key).add(s);
            
        }

        for(List<String> l:hm.values()){
            ans.add(l);
        }

        return ans;

    }
}
