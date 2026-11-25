class Solution {
    public boolean isAnagram(String s, String t) {
        char a1[]=s.toCharArray();
        char b1[]=t.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);
        if(Arrays.equals(a1,b1)){
            return true;
        }else{
            return false;
        }
    }
}
