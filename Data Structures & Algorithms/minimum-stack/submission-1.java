class MinStack {

    private Stack<Integer> stk1;
    private Stack<Integer> stk2;
    public MinStack() {
        stk1=new Stack<Integer>();
        stk2=new Stack<Integer>();

    }
    
    public void push(int val) {
        stk1.push(val);
        val=Math.min(val,stk2.isEmpty()?val:stk2.peek());
        stk2.push(val);
        
    }
    
    public void pop() {
        stk1.pop();
        stk2.pop();
        
    }
    
    public int top() {
        return stk1.peek();
    }
    
    public int getMin() {
        return stk2.peek();   
    }
}
