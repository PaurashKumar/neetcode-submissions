class Solution {
    public boolean isPalindrome(String s) {
        String newstr=s.toUpperCase().replaceAll(" ","").replaceAll("[^A-Z0-9]","");
        StringBuilder sb=new StringBuilder(newstr);
        String l=sb.toString();
        String r=sb.reverse().toString();
        System.out.println(l +" "+ r);
        return l.equals(r);
    }
}
