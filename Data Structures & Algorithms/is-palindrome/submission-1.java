class Solution {
    public boolean isPalindrome(String s) {
        
        String left=s.toUpperCase().replaceAll(" ","").replaceAll("[^A-Z0-9]","");
        StringBuilder str=new StringBuilder(left);
        String right=str.reverse().toString();
        System.out.println("left String:  "+ left +"    right string:  " + right );
        return left.equals(right);
    }
}
