class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stk=new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch=='['||ch=='{'||ch=='('){
                stk.push(ch);
            }else{
            if(stk.isEmpty()){
                return false;
            }
            else if(ch=='}' && stk.peek()!='{'){
                return false;
            }else if(ch==']' && stk.peek()!='['){
                return false;
            }else if(ch==')' && stk.peek()!='('){
                return false;
            }
            stk.pop();
            }
        }
        return stk.isEmpty()?true:false;

    }
}
