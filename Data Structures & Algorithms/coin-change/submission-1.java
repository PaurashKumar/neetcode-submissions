class Solution {
    public int coinChange(int[] coins, int amt) {
        //int mincoin=helper(coins,amt);
        //return mincoin>=1e9?-1:mincoin;

        int dp[]=new int[amt+1];
        Arrays.fill(dp,1+amt);
        dp[0]=0;
        for(int i=1;i<=amt;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
                }
            }
        }

        return dp[amt] > amt?-1:dp[amt];
    }

    public int helper(int coins[],int amt){
        if(amt==0){
            return 0;
        }
        int ans=(int) 1e9;
        System.out.println(ans);
        for(int c:coins){
            if(amt-c>=0){
                ans=Math.min(ans,1+ helper(coins,amt-c));
            }
        }
        return ans;
    }
}
