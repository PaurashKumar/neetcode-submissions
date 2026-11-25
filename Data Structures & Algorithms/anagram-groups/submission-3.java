class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String newstr=new String(arr);
            if(!hm.containsKey(newstr)){
                hm.put(newstr,new ArrayList<>());
            }
            hm.get(newstr).add(s);
        }
        for(Map.Entry<String,List<String>> m:hm.entrySet()){
            ans.add(m.getValue());
        }
        return ans;
    }
}
