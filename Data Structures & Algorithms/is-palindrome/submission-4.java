class Solution {
    public boolean isPalindrome(String s) {

        String ss=s.toUpperCase().replaceAll(" ","").replaceAll("[^A-Z0-9]","");
        System.out.print(ss);
        String l=ss;
        StringBuffer sb=new StringBuffer(ss);
        StringBuffer sb2=sb.reverse();
        String r=new String(sb2);
        return l.equals(r);
        
    }
}
