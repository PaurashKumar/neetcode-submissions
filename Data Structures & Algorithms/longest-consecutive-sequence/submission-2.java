class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int ans=0;
        for(int n:hs){

            if(!hs.contains(n-1)){
                int c=1;
                while(hs.contains(c+n)){
                    c++;
                }
                ans=Math.max(c,ans);
            }
        }
        return ans;
    }
}
