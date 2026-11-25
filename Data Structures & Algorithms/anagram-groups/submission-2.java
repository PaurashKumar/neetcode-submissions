class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> al=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s: strs){
            char[] cc=s.toCharArray();
            Arrays.sort(cc);
            String newstr=new String(cc);
            if(!hm.containsKey(newstr)){
                hm.put(newstr,new ArrayList<>());
            }
            hm.get(newstr).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
