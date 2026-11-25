class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int ans=0;

        for(int i:hs){
            if(!hs.contains(i-1)){
                int c=1;
                while(hs.contains(i+c)){
                    c++;
                }
                ans=Math.max(c,ans);
            }
        }
        return ans;
    }
}
