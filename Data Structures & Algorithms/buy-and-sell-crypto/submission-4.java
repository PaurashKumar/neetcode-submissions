class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;

        int minelement=prices[0];

        for(int i:prices){
            minelement=Math.min(i,minelement);
            profit=Math.max(profit,i-minelement);
        }
        return profit;
        
    }
}
