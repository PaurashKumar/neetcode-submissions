class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            ans+=countPaling(s,i,i);
            ans+=countPaling(s,i,i+1);
        }
        return ans;
    }
    public int countPaling(String s,int l,int r){
        int ans=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                ans++;
                l--;
                r++;
        }
        return ans;
    }
}
