class Solution {
    public String minWindow(String s, String t) {

        if(t.length()==0 || t.length()>s.length()){
            return "";
        }
         
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:t.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        int match=0;
        int start=0;
        int minlen=s.length()+1;
        int substr=0;
        for(int i=0;i<s.length();i++){
            char ele=s.charAt(i);

            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele)-1);
                if(hm.get(ele)==0){
                    match++;
                }
            }
            while(match==hm.size()){
                if(minlen>i-start+1){
                    minlen=i-start+1;
                    substr=start;
                }

                char deletes=s.charAt(start++);
                if(hm.containsKey(deletes)){
                    if(hm.get(deletes)==0){
                        match--;
                    }
                    hm.put(deletes,hm.get(deletes)+1);
                }
            }
        }
        return minlen>s.length()?"":s.substring(substr,substr+minlen);
        
        
    }
}
