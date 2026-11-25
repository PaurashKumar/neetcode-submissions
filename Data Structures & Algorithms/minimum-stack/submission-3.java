class MinStack {
    private Stack<Integer> stk;
    private Stack<Integer> minstk;


    public MinStack() {
        stk=new Stack<>();
        minstk=new Stack<>();
        
    }
    
    public void push(int val) {
        stk.push(val);
        if(minstk.isEmpty() || val<=minstk.peek()){
            minstk.push(val);
        }
        
    }
    
    public void pop() {
        if(stk.isEmpty()){
            return;
        }
        int top=stk.pop();
        if(top==minstk.peek()){
            minstk.pop();
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minstk.peek();
    }
}
