class MinStack {
    public int[] arr = new int[100];
    public int[] mins = new int[100];
    int top = -1;
    int length = 100;
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
            if(top==length)
            {
                int newSize = length * 2;
                int[] extendedArray = Arrays.copyOf(arr, newSize);
                int[] extendedMins = Arrays.copyOf(mins, newSize);
                arr = extendedArray;
                mins = extendedMins;
                length = newSize;
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
            else
            {
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
