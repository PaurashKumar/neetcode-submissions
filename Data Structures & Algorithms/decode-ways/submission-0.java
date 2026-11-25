class Solution {
    public int numDecodings(String s) {
        //Map<Integer,Integer> dp=new HashMap<>();
        //dp.put(s.length(),1);
        //return dfs(s,0,dp);

        int dp[]=new int[s.length()+1];
        dp[s.length()]=1;//base case

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                dp[i]=0;
            }else{
                dp[i]=dp[i+1];
                if(i+1<s.length() &&(s.charAt(i)=='1'||s.charAt(i)=='2' && s.charAt(i+1)<='6')){
                dp[i]+=dp[i+2];    
                }
            }
        }
        return dp[0];
    }
    public int dfs(String s,int i,Map<Integer,Integer> dp){
        if(dp.containsKey(i)){
            return dp.get(i);
        }
        if(s.charAt(i)=='0'){
            return 0;
        }
        int ans=dfs(s,i+1,dp);

        //imp
        if(i+1<s.length() && (s.charAt(i)=='1' || s.charAt(i)=='2' && s.charAt(i+1)<='6')){
            ans+=dfs(s,i+2,dp);
        }
        dp.put(i,ans);

        return ans;
    }
}
