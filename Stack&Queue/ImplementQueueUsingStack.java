import java.util.Iterator;
import java.util.Stack;

class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        s1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (s2.isEmpty()) {
            Iterator<Integer> it = s1.iterator();
            while (it.hasNext()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();


    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (s2.isEmpty()) {
            Iterator<Integer> it = s1.iterator();
            while (it.hasNext()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
