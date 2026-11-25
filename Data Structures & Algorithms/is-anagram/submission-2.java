class Solution {
    public boolean isAnagram(String s, String t) {
        char one[]=s.toCharArray();
        char two[]=t.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        if(Arrays.equals(one,two)){
            return true;
        }
        return false;
    }
}
