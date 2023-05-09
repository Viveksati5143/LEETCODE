class MyStack {
    private Queue<Integer> first;
    private Queue<Integer> second;
    
    public MyStack() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }
    
    public void push(int x) {
        while(!first.isEmpty()){
            second.add(first.remove());
        }
        first.add(x);
        while(!second.isEmpty()){
            first.add(second.remove());
        }
    }
    
    public int pop() {
        return first.remove();
    }
    
    public int top() {
        return first.peek();
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */