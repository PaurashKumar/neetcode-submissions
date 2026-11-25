class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=i;j--){
                String ss=s.substring(i,j+1);
                if(ss.length()>ans.length() && isPaling(ss)){
                    ans=ss;
                    break;
                }
            }
        }
        return s.length()==1? s: ans;
    }
    public boolean isPaling(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
