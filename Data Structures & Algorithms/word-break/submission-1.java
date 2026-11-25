class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        //return helper(s,wordDict,0);


        boolean dp[]=new boolean[s.length()+1];

        dp[s.length()]=true;


        for(int i=s.length()-1;i>=0;i--){

            for(String w:wordDict){
                if(i+ w.length()<=s.length() && s.substring(i,i+w.length()).equals(w)){
                    dp[i]=dp[i+w.length()];
                }
                if(dp[i]){
                    break;
                }
            }
             
        }
        return dp[0];
    }
    public boolean helper(String s,List<String> worddict,int i){

        if(i==s.length()){
            return true;
        }

        for(String w:worddict){

            if(i+w.length()<=s.length() && s.substring(i,i+w.length()).equals(w)){
                if(helper(s,worddict,i+w.length())){
                    return true;
                }
            }
        }

        return false;
    }
}
