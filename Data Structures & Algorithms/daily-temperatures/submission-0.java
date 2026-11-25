class Solution {
    public int[] dailyTemperatures(int[] t) {
        
        int[] ans=new int[t.length];
        Arrays.fill(ans,0);
        int n=t.length;
     
         
        for(int i=0;i<n;i++){
            int j=i+1;
            int c=1;
            while(j<n){
                if(t[i]<t[j]){
                    break;
                }
                j++;
                c++;
            }
            c= (j == n)?0:c;
            ans[i]=c;
        }
        return ans;
    }
}
