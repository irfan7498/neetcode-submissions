class MinStack {

    Deque<Integer> stack;
    PriorityQueue<Integer> min;
    public MinStack() {
        this.stack = new ArrayDeque<>();
        this.min = new PriorityQueue<>();
    }
    
    public void push(int val) { 
        stack.push(val);
        min.offer(val);
    }
    
    public void pop() {
        int val = stack.pop();
        min.remove(val);
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
