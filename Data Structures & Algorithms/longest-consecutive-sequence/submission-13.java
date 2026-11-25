class Solution {
    public int longestConsecutive(int[] nums) {
        // HashSet<Integer> hs=new HashSet<>();
        // for(int i:nums){
        //     hs.add(i);
        // }
        // int ans=0;
        // for(int i:nums){
        //     int c=0;
        //     int curr=i;
        //     while(hs.contains(curr)){
        //         curr++;
        //         c++;
        //     }
        //     ans=Math.max(ans,c);
        // }
        // return ans;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int ans=0;
        for(int i:nums){
            if(!hs.contains(i-1)){
                int c=1;
                while(hs.contains(c+i)){
                    c++;
                }
                ans=Math.max(ans,c);
            }
        }
        return ans;
    }
}
