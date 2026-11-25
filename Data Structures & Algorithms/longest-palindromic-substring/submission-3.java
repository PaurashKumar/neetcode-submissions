class Solution {
    public String longestPalindrome(String s) {
        int resInd=0;
        int resLen=0;
        int n=s.length();

        boolean arr[][]=new boolean[n][n];


        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){

                if(s.charAt(i)==s.charAt(j) &&
                 (j-i <=2 || arr[i+1][j-1])){

                    arr[i][j]=true;
                    if(resLen < (j-i+1)){
                        resInd=i;
                        resLen=j-i+1;
                    }
                }
            
            }
        }
        return s.substring(resInd,resInd+resLen);
        
    }
}
