class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int ans=0;
        int j=0;
        for(int i=0;i<s.length();i++){
             while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(j));
                j++;
             }
             hs.add(s.charAt(i));
             ans=Math.max(ans,i-j+1);
        }
        System.out.println(hs);
        return ans;
    }
}
