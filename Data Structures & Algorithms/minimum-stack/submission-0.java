class MinStack {
    private Stack<Integer> stk;
    private Stack<Integer> minstk;
    public MinStack() {
        stk=new Stack<>();
        minstk=new Stack<>();
        
    }
    
    public void push(int val) {
        stk.push(val);
        val=Math.min(val,minstk.isEmpty()?val:minstk.peek());
        minstk.push(val);
    }
    
    public void pop() {
        stk.pop();
        minstk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minstk.peek();
    }
}
