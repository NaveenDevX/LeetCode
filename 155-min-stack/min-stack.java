class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> mStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        mStack.push(mStack.isEmpty() || val <= mStack.peek() ? val : mStack.peek());
    }

    public void pop() {
        stack.pop();
        mStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return mStack.peek();
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