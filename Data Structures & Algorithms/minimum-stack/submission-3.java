class MinStack {
    public int[] arr = new int[30000];
    public int[] mins = new int[30000];
    int top = -1;
    int length = 30000;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(top==-1)
        {
            top++;
            mins[top] = val;
            arr[top] = val;
        }
        else
        {
            top++;
            arr[top] = val;
            if(val<mins[top-1])
            {
                mins[top] = val;
            }
            else
            {
                mins[top] = mins[top-1];
            }
        }
    }
    
    public void pop() {
        top--;
    }
    
    public int top() {
        return arr[top];
    }
    
    public int getMin() {
        return mins[top];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */