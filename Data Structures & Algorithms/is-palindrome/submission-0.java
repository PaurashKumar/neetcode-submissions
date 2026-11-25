class Solution {
    public boolean isPalindrome(String s) {
        String l=s.toUpperCase().replaceAll(" ","").replaceAll("[^A-Z0-9]","");
        StringBuilder sb=new StringBuilder(l);
        String r=sb.reverse().toString();
        System.out.println(r);
        System.out.println(l);
        return l.equals(r);
    }
}
