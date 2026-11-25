class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
        HashSet<Integer>hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        for(int i:nums){
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
