class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        dfs("",ans,n);
        return ans;
    }
    public void dfs(String s,List<String> ans,int n){
        if(n*2==s.length()){
            if(valid(s)){
            ans.add(s);
            }
            return;
        }
        dfs(s + '(',ans,n);
        dfs(s + ')',ans,n);
    }
    public boolean valid(String s){
        int cc=0;
        for(char c:s.toCharArray()){
            if (c=='('){
                cc+=1;
            }else{
                cc+=-1;
            }
            if(cc<0){
                return false;
            }
        }
        return cc==0;
    }
}
