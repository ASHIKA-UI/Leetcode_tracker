// Last updated: 7/21/2026, 9:00:44 AM
import java.util.*;

class MyQueue {
    Stack<Integer> Instack;
    Stack<Integer> Outstack;

    public MyQueue() {
        Instack = new Stack<>();
        Outstack = new Stack<>();
    }
    
    public void push(int x) {
        Instack.push(x);
    }
    
    public int pop() {
        if (Outstack.isEmpty()) {
            while (!Instack.isEmpty()) {
                Outstack.push(Instack.pop());
            }
        }
        return Outstack.pop();
    }
    
    public int peek() {
        if (Outstack.isEmpty()) {
            while (!Instack.isEmpty()) {
                Outstack.push(Instack.pop());
            }
        }
        return Outstack.peek();
    }
    
    public boolean empty() {
        return Instack.isEmpty() && Outstack.isEmpty();
    }
}