class Solution {
    public String minWindow(String s, String t) {
        if(t.length()==0){
            return "";
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:t.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int matches=0;
        int start=0;
        int minlen=s.length()+1;
        int substr=0;

        for(int endwindow=0;endwindow<s.length();endwindow++){
            char right=s.charAt(endwindow);
            if(hm.containsKey(right)){
                hm.put(right,hm.get(right)-1);
                if(hm.get(right)==0){
                    matches++;
                }
            }

            while(matches==hm.size()){
                if(minlen>endwindow-start+1){
                    minlen=endwindow-start+1;
                    substr=start;
                }
                char deleted=s.charAt(start++);
                if(hm.containsKey(deleted)){
                    if(hm.get(deleted)==0){
                        matches--;
                    }
                    hm.put(deleted,hm.get(deleted)+1);
                }
            }

        }
        return minlen>s.length()?"":s.substring(substr,substr+minlen);
    }
}
